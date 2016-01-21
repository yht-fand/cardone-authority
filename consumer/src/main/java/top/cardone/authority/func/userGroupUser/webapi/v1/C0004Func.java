package top.cardone.authority.func.userGroupUser.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserGroupUserService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组与用户 - 创建
 */
@Component("/web-api/v1/configuration/userGroupUser/c0004.json")
public class C0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserGroupUserService.class).save(map);
    }
}
