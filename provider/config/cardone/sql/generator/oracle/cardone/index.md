
### 权限(authority)

#### ER 图

![权限](authority.png)

#### 表结构

##### 用户与许可（C1_USER_PERMISSION）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERMISSION_CODE|YES|String(256)|许可编号
PERMISSION_ID|YES|String(255)|许可标识
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
USER_CODE|YES|String(64)|用户编号
USER_ID|YES|String(255)|用户标识
USER_PERMISSION_ID|NO|String(255)|用户与许可标识
VERSION_|YES|Integer(38)|版本

##### 用户与角色（C1_USER_ROLE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
ROLE_CODE|YES|String(64)|角色编号
ROLE_ID|YES|String(255)|角色标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
USER_CODE|YES|String(64)|用户编号
USER_ID|YES|String(255)|用户标识
USER_ROLE_ID|NO|String(255)|用户与角色标识
VERSION_|YES|Integer(38)|版本

##### 许可（C1_PERMISSION）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERMISSION_CODE|NO|String(256)|许可编号
PERMISSION_ID|NO|String(255)|许可标识
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TYPE_CODE|YES|String(64)|类别编号(数据字典)
VERSION_|YES|Integer(38)|版本

##### 许可映射（C1_PERMISSION_MAPPER）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
MAPPER_CODE|YES|String(256)|映射编号
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERMISSION_CODE|YES|String(256)|许可编号
PERMISSION_ID|YES|String(255)|许可标识
PERMISSION_MAPPER_ID|NO|String(64)|许可映射标识
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TYPE_CODE|YES|String(64)|类别编号(数据字典)
VERSION_|YES|Integer(38)|版本

##### 角色（C1_ROLE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
ROLE_CODE|NO|String(64)|角色编号
ROLE_ID|NO|String(255)|角色标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TYPE_CODE|YES|String(64)|类别编号(数据字典)
VERSION_|YES|Integer(38)|版本

##### 角色与许可（C1_ROLE_PERMISSION）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERMISSION_CODE|YES|String(256)|许可编号
PERMISSION_ID|YES|String(255)|许可标识
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
ROLE_CODE|YES|String(64)|角色编号
ROLE_ID|YES|String(255)|角色标识
ROLE_PERMISSION_ID|NO|String(255)|角色与许可标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VERSION_|YES|Integer(38)|版本

##### 用户组（C1_USER_GROUP）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
NAME|YES|String(128)|名称
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PARENT_CODE|YES|String(64)|父级编号
PARENT_ID|YES|String(64)|父级标识
PARENT_TREE_CODE|YES|String(1024)|父级树编号
PARENT_TREE_ID|YES|String(1024)|父级树标识
PARENT_TREE_NAME|YES|String(1024)|父级树名称
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TYPE_CODE|YES|String(64)|类别编号(数据字典)
USER_GROUP_CODE|NO|String(64)|用户组编号
USER_GROUP_ID|NO|String(255)|用户组标识
VERSION_|YES|Integer(38)|版本

##### 用户组与许可（C1_USER_GROUP_PERMISSION）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERMISSION_CODE|YES|String(256)|许可编号
PERMISSION_ID|YES|String(255)|许可标识
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
USER_GROUP_CODE|YES|String(64)|用户组编号
USER_GROUP_ID|YES|String(255)|用户组标识
USER_GROUP_PERMISSION_ID|NO|String(255)|用户组与许可标识
VERSION_|YES|Integer(38)|版本

##### 用户组与角色（C1_USER_GROUP_ROLE）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
ROLE_CODE|YES|String(64)|角色编号
ROLE_ID|YES|String(255)|角色标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
USER_GROUP_CODE|YES|String(64)|用户组编号
USER_GROUP_ID|YES|String(255)|用户组标识
USER_GROUP_ROLE_ID|NO|String(255)|用户组与角色标识
VERSION_|YES|Integer(38)|版本

##### 用户组与用户（C1_USER_GROUP_USER）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
USER_CODE|YES|String(64)|用户编号
USER_GROUP_CODE|YES|String(64)|用户组编号
USER_GROUP_ID|YES|String(255)|用户组标识
USER_GROUP_USER_ID|NO|String(255)|用户组与用户标识
USER_ID|YES|String(255)|用户标识
VERSION_|YES|Integer(38)|版本

##### 授权消费（C1_OAUTH_CONSUMER）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CLIENT_SECRET|YES|String(256)|客户端密钥
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
OAUTH_CONSUMER_ID|NO|String(255)|授权消费标识
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
VERSION_|YES|Integer(38)|版本

##### 令牌信息（C1_TOKEN_INFO）

字段名|可为空|类型及范围|说明
---|---|---|---
BATCH_NO|YES|String(64)|批次编号
BEGIN_DATE|YES|Date(11)|开始日期
CLIENT_ID|YES|String(64)|客户端标识
CREATED_BY_CODE|YES|String(64)|创建人编号
CREATED_BY_ID|YES|String(64)|创建人标识
CREATED_DATE|YES|Date(11)|创建日期
DATA_STATE_CODE|YES|String(64)|数据状态编号(数据字典)
DEPARTMENT_CODE|YES|String(64)|部门编号
END_DATE|YES|Date(11)|结束日期
FLAG_CODE|YES|String(64)|标记编号(数据字典：工作流、同步、生成、录入、审批)
FLAG_OBJECT_CODE|YES|String(64)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
JSON_DATA|YES|Object(4000)|json数据
LAST_MODIFIED_BY_CODE|YES|String(64)|最后修改人编号
LAST_MODIFIED_BY_ID|YES|String(64)|最后修改人标识
LAST_MODIFIED_DATE|YES|Date(11)|最后修改日期
ORDER_BY_|YES|Integer(38)|排序
ORG_CODE|YES|String(64)|组织编号
PERSONAL_CODE|YES|String(64)|个人编号
PERSONAL_ID|YES|String(64)|个人标识
SCOPE|YES|String(512)|范围
SITE_CODE|YES|String(64)|站点编号
STATE_CODE|YES|String(64)|状态编号(数据字典)
SYSTEM_INFO_CODE|YES|String(64)|系统信息编号
TOKEN_INFO_CODE|NO|String(64)|令牌信息编号
TOKEN_INFO_ID|NO|String(255)|令牌信息标识
USER_CODE|YES|String(64)|用户编号
USER_ID|YES|String(255)|用户标识
VERSION_|YES|Integer(38)|版本
