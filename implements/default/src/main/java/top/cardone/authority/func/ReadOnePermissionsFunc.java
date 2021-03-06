package top.cardone.authority.func;

import com.google.common.collect.Sets;
import lombok.Setter;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationInfo;
import org.springframework.util.CollectionUtils;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func0;
import top.cardone.core.util.func.Func1;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author cardone-home-001 on 2016/4/19.
 */
public class ReadOnePermissionsFunc implements Func0<String> {
    @Setter
    private String separator = ",";

    @Setter
    private String permission = "navigation";

    @Setter
    private String[] allDataRoles = new String[]{"leader-administrator", "all-data-administrator"};

    private String authorizationInfoBeanName = "shiroDbRealm";

    @Setter
    private String readListDepartmentCodeTreeByDepartmentCodeFuncBeanId = "readListDepartmentCodeTreeByDepartmentCodeFunc";

    @Setter
    private String readOneUserDepartmentCodeByUserCodeFuncBeanId = "readOneUserDepartmentCodeByUserCodeFunc";

    private String readOnePermissions(String userCode) {
        if (!SecurityUtils.getSubject().isAuthenticated()) {
            return UUID.randomUUID().toString();
        }

        // 管理角色
        if (SecurityUtils.getSubject().hasRole("administrator")) {
            return "*";
        }

        // 所有数据管理角色
        if (!"navigation:view:".equals(this.permission)) {
            for (String allDataRole : allDataRoles) {
                if (SecurityUtils.getSubject().hasRole(allDataRole)) {
                    return "*";
                }
            }
        }

        Collection<String> stringPermissions = ApplicationContextHolder.getBean(AuthorizationInfo.class, authorizationInfoBeanName).getStringPermissions();

        List<String> permissions = null;

        if (!CollectionUtils.isEmpty(stringPermissions)) {
            permissions = stringPermissions.stream().filter(permission -> StringUtils.startsWithIgnoreCase(permission, this.permission)).collect(Collectors.toList());
        }

        if (CollectionUtils.isEmpty(permissions)) {
            if ("user:view:".equals(this.permission)) {
                // 登录用户的用户编号
                return userCode;
            } else if ("department:view:".equals(this.permission)) {
                // 查询部门权限并有部门树数据管理角色或部门数据管理角色，默认给登录用户的部门编号
                if (SecurityUtils.getSubject().hasRole("department-data-administrator") || SecurityUtils.getSubject().hasRole("department-tree-data-administrator")) {
                    permissions.add((String) ApplicationContextHolder.getBean(Func1.class, this.readOneUserDepartmentCodeByUserCodeFuncBeanId).func(userCode));
                } else {
                    return UUID.randomUUID().toString();
                }
            } else {
                return UUID.randomUUID().toString();
            }
        }

        if (CollectionUtils.contains(permissions.iterator(), "*")) {
            return "*";
        }

        Set<String> newPermissionSet = Sets.newHashSet();

        for (String permission : permissions) {
            String newPermission = permission;

            if (StringUtils.startsWith(newPermission, this.permission)) {
                newPermission = StringUtils.substring(permission, this.permission.length());
            }

            newPermissionSet.add(newPermission);

            // 查询部门权限并有部门树数据管理角色
            if ("department:view:".equals(this.permission) && SecurityUtils.getSubject().hasRole("department-tree-data-administrator")) {
                List<String> departmentCodeList = (List<String>) ApplicationContextHolder.getBean(Func1.class, this.readListDepartmentCodeTreeByDepartmentCodeFuncBeanId).func(newPermission);

                if (!CollectionUtils.isEmpty(departmentCodeList)) {
                    newPermissionSet.addAll(departmentCodeList);
                }
            }
        }

        return StringUtils.join(newPermissionSet, separator);
    }

    @Override
    public String func() {
        String userCode = ApplicationContextHolder.func(Func0.class, func -> (String) func.func(), "readPrincipalFunc");

        if (StringUtils.isBlank(userCode)) {
            return UUID.randomUUID().toString();
        }

        return ApplicationContextHolder.getBean(Cache.class).get(
                UserPermissionService.class.getName(),
                this.permission + "," + userCode, (Func0<String>) () -> this.readOnePermissions(userCode)
        );
    }
}