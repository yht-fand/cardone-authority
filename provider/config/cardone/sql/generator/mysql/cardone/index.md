
### 权限(authority)

#### ER 图

![权限](authority.png)

#### 表结构

##### 用户与许可（c1_user_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODE|YES|String(255)|许可代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
USER_CODE|YES|String(255)|用户代码
USER_PERMISSION_ID|NO|String(255)|用户与许可标识
VERSION_|YES|Integer(10)|版本

##### 用户与角色（c1_user_role）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
ROLE_CODE|YES|String(255)|角色代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
USER_CODE|YES|String(255)|用户代码
USER_ROLE_ID|NO|String(255)|用户与角色标识
VERSION_|YES|Integer(10)|版本

##### 许可（c1_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树名称
PERMISSION_CODE|NO|String(255)|许可代码
PERMISSION_ID|NO|String(255)|许可标识
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|YES|String(255)|类别代码(数据字典)
VERSION_|YES|Integer(10)|版本

##### 角色（c1_role）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树名称
ROLE_CODE|NO|String(255)|角色代码
ROLE_ID|NO|String(255)|角色标识
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|YES|String(255)|类别代码(数据字典)
VERSION_|YES|Integer(10)|版本

##### 角色与许可（c1_role_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODE|YES|String(255)|许可代码
ROLE_CODE|YES|String(255)|角色代码
ROLE_PERMISSION_ID|NO|String(255)|角色与许可标识
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Integer(10)|版本

##### 用户组（c1_user_group）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
NAME|YES|String(255)|名称
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PARENT_CODE|YES|String(255)|父级代码
PARENT_TREE_CODE|YES|String(1023)|父级树代码
PARENT_TREE_NAME|YES|String(1023)|父级树名称
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TYPE_CODE|YES|String(255)|类别代码(数据字典)
USER_GROUP_CODE|NO|String(255)|用户组代码
USER_GROUP_ID|NO|String(255)|用户组标识
VERSION_|YES|Integer(10)|版本

##### 用户组与许可（c1_user_group_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
PERMISSION_CODE|YES|String(255)|许可代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
USER_GROUP_CODE|YES|String(255)|用户组代码
USER_GROUP_PERMISSION_ID|NO|String(255)|用户组与许可标识
VERSION_|YES|Integer(10)|版本

##### 用户组与角色（c1_user_group_role）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
ROLE_CODE|YES|String(255)|角色代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
USER_GROUP_CODE|YES|String(255)|用户组代码
USER_GROUP_ROLE_ID|NO|String(255)|用户组与角色标识
VERSION_|YES|Integer(10)|版本

##### 用户组与用户（c1_user_group_user）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
USER_CODE|YES|String(255)|用户代码
USER_GROUP_CODE|YES|String(255)|用户组代码
USER_GROUP_USER_ID|NO|String(255)|用户组与用户标识
VERSION_|YES|Integer(10)|版本

##### 授权消费（c1_oauth_consumer）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CLIENT_SECRET|YES|String(255)|客户端密钥
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
OAUTH_CONSUMER_ID|NO|String(255)|授权消费标识
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
VERSION_|YES|Integer(10)|版本

##### 令牌信息（c1_token_info）

字段名|可为空|类型及范围|说明
---|---|---|---
BEGIN_DATE|YES|Date(19)|开始时间
CLIENT_ID|YES|String(255)|客户端标识
CREATED_BY_CODE|YES|String(255)|创建人代码
CREATED_DATE|YES|Date(19)|创建时间
DATA_STATE_CODE|YES|String(255)|数据状态代码(数据字典)
DEPARTMENT_CODE|YES|String(255)|部门代码
END_DATE|YES|Date(19)|结束时间
FLAG_CODE|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|String()|JSON数据
LAST_MODIFIED_BY_CODE|YES|String(255)|最后修改人代码
LAST_MODIFIED_DATE|YES|Date(19)|最后修改时间
ORDER_|YES|Long(19)|排序
ORG_CODE|YES|String(255)|组织代码
SCOPE|YES|String(511)|范围
SITE_CODE|YES|String(255)|站点代码
STATE_CODE|YES|String(255)|状态代码(数据字典)
SYSTEM_INFO_CODE|YES|String(255)|系统信息代码
TOKEN_INFO_CODE|NO|String(255)|令牌信息代码
TOKEN_INFO_ID|NO|String(255)|令牌信息标识
USER_CODE|YES|String(255)|用户代码
VERSION_|YES|Integer(10)|版本
