package top.cardone.authority.func;

import com.google.common.collect.Sets;
import lombok.Setter;

import org.apache.shiro.SecurityUtils;
import org.springframework.util.CollectionUtils;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * @author cardone-home-001 on 2016/4/19.
 */
public class ReadOnePermissionsFunc implements Func1<String, Object> {
    @Setter
    private String separator = ",";

    @Setter
    private String permission = "navigation";

    @Setter
    private String readListDepartmentCodeTreeByDepartmentCodeFuncBeanId = "readListDepartmentCodeTreeByDepartmentCodeFunc";

    @Setter
    private String readOneUserDepartmentCodeByUserCodeFuncBeanId = "readOneUserDepartmentCodeByUserCodeFunc";

    @Override
    public String func(Object obj) {
        String userCode = (String) SecurityUtils.getSubject().getPrincipal();

        // 管理角色
        if (SecurityUtils.getSubject().hasRole("administrator")) {
            return "*";
        }

        // 所有数据管理角色
        if (SecurityUtils.getSubject().hasRole("all-data-administrator") && !"navigation:view:".equals(this.permission)) {
            return "*";
        }

        List<String> permissionList = ApplicationContextHolder.getBean(UserPermissionService.class).readListPermissionCodeByPermissionCache(userCode, this.permission);

        if (CollectionUtils.isEmpty(permissionList)) {
            if ("user:view:".equals(this.permission)) {
                // 登录用户的用户编号
                return userCode;
            } else if ("department:view:".equals(this.permission)) {
                // 查询部门权限并有部门树数据管理角色或部门数据管理角色，默认给登录用户的部门编号
                if (SecurityUtils.getSubject().hasRole("department-data-administrator") || SecurityUtils.getSubject().hasRole("department-tree-data-administrator")) {
                    permissionList.add((String) ApplicationContextHolder.getBean(Func1.class, this.readOneUserDepartmentCodeByUserCodeFuncBeanId).func(userCode));
                } else {
                    return UUID.randomUUID().toString();
                }
            } else {
                return UUID.randomUUID().toString();
            }
        }

        if (CollectionUtils.contains(permissionList.iterator(), "*")) {
            return "*";
        }

        Set<String> newPermissionSet = Sets.newHashSet();

        for (String permission : permissionList) {
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
}