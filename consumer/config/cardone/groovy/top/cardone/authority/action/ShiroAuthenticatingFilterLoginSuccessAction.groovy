package top.cardone.authority.action

import org.apache.commons.lang3.ObjectUtils
import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.subject.Subject
import top.cardone.cache.Cache
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.action.Action1
import top.cardone.core.util.action.Action4

import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class ShiroAuthenticatingFilterLoginSuccessAction implements Action4<AuthenticationToken, Subject, ServletRequest, ServletResponse> {
    def authorityCacheTimeout

    def cacheBeanName = "cardone.web.cache";

    ShiroAuthenticatingFilterLoginSuccessAction() {
        authorityCacheTimeout = ObjectUtils.defaultIfNull(ApplicationContextHolder.applicationContext.getEnvironment().getProperty("authority.cache.timeout", Long.class),
                10 * 60)
    }

    @Override
    void action(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) {
        if (Objects.isNull(token.getPrincipal())) {
            return
        }

        def time = ApplicationContextHolder.getBean(Cache.class, cacheBeanName).get(
                ShiroAuthenticatingFilterLoginSuccessAction.class.getName(),
                1,
                token.getPrincipal(),
                { System.currentTimeMillis() })

        def timeDifference = (System.currentTimeMillis() - time) / 1000L

        if (timeDifference < authorityCacheTimeout) {
            return
        }

        ApplicationContextHolder.getBean(Cache.class, cacheBeanName).put(
                ShiroAuthenticatingFilterLoginSuccessAction.class.getName(),
                1,
                token.getPrincipal(),
                System.currentTimeMillis())

        ApplicationContextHolder.getBean(Action1.class, "top/cardone/usercenter/action/EvictUserCacheAction").action(token.getPrincipal())
    }
}