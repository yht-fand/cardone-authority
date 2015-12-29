package top.cardone.authority.dto;

import top.cardone.authority.po.UserRole;

/**
 * 用户与角色
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class UserRoleDto extends UserRole {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 831298364649729331L;
}