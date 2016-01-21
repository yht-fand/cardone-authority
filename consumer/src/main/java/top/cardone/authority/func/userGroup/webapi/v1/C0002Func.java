package top.cardone.authority.func.userGroup.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组 - 批量创建
 */
@Component("/web-api/v1/configuration/userGroup/c0002.json")
public class C0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(UserGroupService.class).save(map);
    }
}
