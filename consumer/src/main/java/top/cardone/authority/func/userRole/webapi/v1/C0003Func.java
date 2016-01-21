package top.cardone.authority.func.userRole.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与角色 - 创建
 */
@Component("/web-api/v1/configuration/userRole/c0003.json")
public class C0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserRoleService.class).save(map);
    }
}
