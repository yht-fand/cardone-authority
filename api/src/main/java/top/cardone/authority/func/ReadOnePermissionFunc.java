package top.cardone.authority.func;

import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/19.
 */
public class ReadOnePermissionFunc implements Func1<String, Object> {
    @Setter
    private String key = "permissions";

    @Setter
    private String functionCode = "navigation";

    @Override
    public String func(Object obj) {
        Map<String, Object> permissionMap = ApplicationContextHolder.getBean(UserPermissionService.class).findOneByFunctionCodeCache(this.functionCode);

        return MapUtils.getString(permissionMap, this.key);
    }
}
