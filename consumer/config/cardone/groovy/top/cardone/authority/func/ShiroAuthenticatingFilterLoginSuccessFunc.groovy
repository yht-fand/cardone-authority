package top.cardone.authority.func

import org.apache.commons.lang3.ObjectUtils
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.subject.Subject
import org.springframework.core.task.TaskExecutor
import org.springframework.scheduling.support.TaskUtils
import top.cardone.cache.Cache
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.action.Action1
import top.cardone.core.util.func.Func4

import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class ShiroAuthenticatingFilterLoginSuccessFunc implements Func4<Boolean, AuthenticationToken, Subject, ServletRequest, ServletResponse> {
    def authorityCacheTimeout

    def cacheBeanName = "cardone.web.cache"

    ShiroAuthenticatingFilterLoginSuccessFunc() {
        authorityCacheTimeout = ObjectUtils.defaultIfNull(ApplicationContextHolder.applicationContext.getEnvironment().getProperty("authority.cache.timeout", Long.class),
                10 * 60)
    }

    @Override
    Boolean func(AuthenticationToken authenticationToken, Subject subject, ServletRequest servletRequest, ServletResponse servletResponse) {
        if (Objects.isNull(authenticationToken.getPrincipal())) {
            return true
        }

        def time = ApplicationContextHolder.getBean(Cache.class, cacheBeanName).get(
                ShiroAuthenticatingFilterLoginSuccessFunc.class.getName(),
                1,
                authenticationToken.getPrincipal(),
                { System.currentTimeMillis() })

        def timeDifference = (System.currentTimeMillis() - time) / 1000L

        if (timeDifference < authorityCacheTimeout) {
            return true
        }

        ApplicationContextHolder.getBean(TaskExecutor.class, "slowTaskExecutor").execute(TaskUtils.decorateTaskWithErrorHandler({
            Date dbLastModifyDate = ApplicationContextHolder.getBean(NavigationService.class).
                    readOneByFuncIdCache(Date.class, "top/cardone/authority/userGroup/func/ReadOneMaxChangeDateFunc",
                            ["userCode": authenticationToken.getPrincipal()])

            Thread.sleep(10)

            if (!dbLastModifyDate) {
                return
            }

            if (dbLastModifyDate.getTime() > authorityCacheTimeout) {
                return
            }

            ApplicationContextHolder.getBean(Cache.class, cacheBeanName).put(
                    ShiroAuthenticatingFilterLoginSuccessFunc.class.getName(),
                    1,
                    authenticationToken.getPrincipal(),
                    System.currentTimeMillis())

            ApplicationContextHolder.getBean(Action1.class, "top/cardone/usercenter/action/EvictUserCacheAction").action(authenticationToken.getPrincipal())
        }, null, true))

        return true
    }
}