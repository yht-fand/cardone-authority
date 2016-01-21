package top.cardone.authority.func.userPermission.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与许可 - 删除
 */
@Component("/web-api/v1/configuration/userPermission/d0003.json")
public class D0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserPermissionService.class).delete(map);
    }
}
