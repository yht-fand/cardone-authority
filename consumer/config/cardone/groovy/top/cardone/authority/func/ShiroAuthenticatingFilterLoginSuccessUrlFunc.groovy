package top.cardone.authority.func

import com.google.gson.Gson
import groovy.util.logging.Log4j2
import org.apache.commons.io.IOUtils
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.subject.Subject
import top.cardone.authority.service.PermissionMapperService
import top.cardone.cache.Cache
import top.cardone.context.ApplicationContextHolder
import top.cardone.context.util.CodeExceptionUtils
import top.cardone.context.util.StringUtils
import top.cardone.core.CodeException
import top.cardone.core.util.func.Func4

import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest
import java.nio.charset.StandardCharsets

@Log4j2
class ShiroAuthenticatingFilterLoginSuccessUrlFunc implements Func4<Boolean, AuthenticationToken, Subject, ServletRequest, ServletResponse> {
    def cacheBeanName = "cardone.web.cache"

    @Override
    Boolean func(AuthenticationToken authenticationToken, Subject subject, ServletRequest servletRequest, ServletResponse servletResponse) {
        if (Objects.isNull(authenticationToken.getPrincipal())) {
            return true
        }

        def list = ApplicationContextHolder.getBean(Cache.class, cacheBeanName).get(
                PermissionMapperService.class.getName(),
                "findListForAllData", {
            ApplicationContextHolder.getBean(PermissionMapperService.class).findListCache([
                    "stateCode"       : "1",
                    "dataStateCode"   : "1",
                    "order_by_orderBy": "asc",
                    "typeCode"        : "api_url"
            ])
        })

        if (!list) {
            return true
        }

        HttpServletRequest request = servletRequest

        def servletPath = request.getServletPath()

        for (def it : list) {
            if (!StringUtils.match(it.mapper_code, servletPath)) {
                continue
            }

            if (subject.isPermitted(it.permission_code)) {
                return true
            }

            def e = new CodeException("unauthorized path", "未经许可的路径")

            servletResponse.setCharacterEncoding(StandardCharsets.UTF_8.name())
            servletResponse.setContentType(org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)

            Writer out = servletResponse.getWriter()

            try {
                def errorInfo = CodeExceptionUtils.newMap(servletPath, e)

                String json = ApplicationContextHolder.getBean(Gson.class).toJson(errorInfo)

                errorInfo.clear()

                errorInfo = null

                out.write(json)

                json = null
            } catch (java.io.IOException ex) {
                log.error(ex.getMessage(), ex)
            } finally {
                IOUtils.closeQuietly(out)
            }

            return false
        }

        return true
    }
}