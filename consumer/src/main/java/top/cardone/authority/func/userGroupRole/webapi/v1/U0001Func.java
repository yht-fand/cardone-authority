package top.cardone.authority.func.userGroupRole.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserGroupRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组与角色 - 修改
 */
@Component("/web-api/v1/configuration/userGroupRole/u0001.json")
public class U0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserGroupRoleService.class).update(map);
    }
}