package top.cardone.authority.po;

import java.util.Date;

/**
 * 许可
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class Permission implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 676668979486711792L;

    /**
     * 开始时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date beginDate;

    /**
     * 创建人代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdByCode;

    /**
     * 创建时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date createdDate;

    /**
     * 数据状态代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String dataStateCode;

    /**
     * 部门代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String departmentCode;

    /**
     * 结束时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date endDate;

    /**
     * 最后修改人代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedByCode;

    /**
     * 最后修改时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date lastModifiedDate;

    /**
     * 组织代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String orgCode;

    /**
     * 父级代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentCode;

    /**
     * 父级树代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeCode;

    /**
     * 父级树名称
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeName;

    /**
     * 许可代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String permissionCode;

    /**
     * 许可代码集合
     */
    @lombok.Getter
    @lombok.Setter
    protected String permissionCodes;

    /**
     * 许可标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String permissionId;

    /**
     * 角色代码集合
     */
    @lombok.Getter
    @lombok.Setter
    protected String roleCodes;

    /**
     * 状态代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String stateCode;

    /**
     * 版本
     */
    @lombok.Getter
    @lombok.Setter
    protected Long version;

    /**
     * 工作流标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String wfId;
}