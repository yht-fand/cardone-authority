package top.cardone.authority.func;

import lombok.Setter;
import org.apache.shiro.SecurityUtils;
import org.springframework.util.CollectionUtils;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.UUID;

/**
 * Created by cardone-home-001 on 2016/4/19.
 */
public class ReadOnePermissionsFunc implements Func1<String, Object> {
    @Setter
    private String separator = ",";

    @Setter
    private String permission = "navigation";

    @Override
    public String func(Object obj) {
        String userCode = (String) SecurityUtils.getSubject().getPrincipal();

        List<String> permissionList = ApplicationContextHolder.getBean(UserPermissionService.class).readListPermissionCodeByPermission(userCode, this.permission);

        if (CollectionUtils.isEmpty(permissionList)) {
            if ("user:view:".equals(permission)) {
                return userCode;
            }

            return UUID.randomUUID().toString();
        }

        if (CollectionUtils.contains(permissionList.iterator(), "*")) {
            return "*";
        }

        return StringUtils.join(permissionList, separator);
    }
}