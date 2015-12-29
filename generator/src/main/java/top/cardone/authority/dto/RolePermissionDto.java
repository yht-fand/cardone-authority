package top.cardone.authority.dto;

import top.cardone.authority.po.RolePermission;

/**
 * 角色与许可
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class RolePermissionDto extends RolePermission {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 610443166879028207L;
}