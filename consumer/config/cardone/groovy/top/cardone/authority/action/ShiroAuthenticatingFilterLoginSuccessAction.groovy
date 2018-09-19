package top.cardone.authority.action

import org.apache.shiro.authc.AuthenticationToken
import org.apache.shiro.subject.Subject
import top.cardone.core.util.action.Action4

import javax.servlet.ServletRequest
import javax.servlet.ServletResponse

class ShiroAuthenticatingFilterLoginSuccessAction implements Action4<AuthenticationToken, Subject, ServletRequest, ServletResponse>{
    @Override
    void action(AuthenticationToken token, Subject subject, ServletRequest request, ServletResponse response) {

    }
}