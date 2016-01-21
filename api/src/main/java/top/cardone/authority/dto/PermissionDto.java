package top.cardone.authority.dto;

import top.cardone.authority.po.Permission;

/**
 * 许可
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class PermissionDto extends Permission {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 728307466145035119L;
}