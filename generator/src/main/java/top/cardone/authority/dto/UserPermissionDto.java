package top.cardone.authority.dto;

import top.cardone.authority.po.UserPermission;

/**
 * 用户与许可
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class UserPermissionDto extends UserPermission {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 601854744688636236L;
}