package top.cardone.authority.po;

import java.util.Date;

/**
 * 角色
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class Role implements java.io.Serializable {

    /**
     * 批次编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String batchNo;

    /**
     * 开始日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date beginDate;

    /**
     * 创建人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdByCode;

    /**
     * 创建人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdById;

    /**
     * 创建日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date createdDate;

    /**
     * 数据状态编号(数据字典)
     */
    @lombok.Getter
    @lombok.Setter
    protected String dataStateCode;

    /**
     * 部门编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String departmentCode;

    /**
     * 结束日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date endDate;

    /**
     * 标记编号(数据字典：工作流、同步、生成、录入、审批)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagCode;

    /**
     * 标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagObjectCode;

    /**
     * json数据
     */
    @lombok.Getter
    @lombok.Setter
    protected Object jsonData;

    /**
     * 最后修改人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedByCode;

    /**
     * 最后修改人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedById;

    /**
     * 最后修改日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date lastModifiedDate;

    /**
     * 名称
     */
    @lombok.Getter
    @lombok.Setter
    protected String name;

    /**
     * 排序
     */
    @lombok.Getter
    @lombok.Setter
    protected Long orderBy;

    /**
     * 组织编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String orgCode;

    /**
     * 父级编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentCode;

    /**
     * 父级标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentId;

    /**
     * 父级树编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeCode;

    /**
     * 父级树标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeId;

    /**
     * 父级树名称
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeName;

    /**
     * 个人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String personalCode;

    /**
     * 个人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String personalId;

    /**
     * 角色编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String roleCode;

    /**
     * 角色标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String roleId;

    /**
     * 站点编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String siteCode;

    /**
     * 状态编号(数据字典)
     */
    @lombok.Getter
    @lombok.Setter
    protected String stateCode;

    /**
     * 系统信息编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String systemInfoCode;

    /**
     * 类别编号(数据字典)
     */
    @lombok.Getter
    @lombok.Setter
    protected String typeCode;

    /**
     * 版本
     */
    @lombok.Getter
    @lombok.Setter
    protected Integer version;
}