package top.cardone.authority.func.userPermission.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与许可 - 修改
 */
@Component("/web-api/v1/configuration/userPermission/u0001.json")
public class U0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserPermissionService.class).update(map);
    }
}