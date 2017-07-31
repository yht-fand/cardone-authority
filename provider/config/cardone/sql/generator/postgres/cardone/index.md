
### 权限(authority)

#### ER 图

![权限](authority.png)

#### 表结构

##### 用户与许可（c1_user_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
permission_code|YES|String(255)|许可编号
permission_id|YES|String(255)|许可标识
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
user_code|YES|String(255)|用户编号
user_id|YES|String(255)|用户标识
user_permission_id|NO|String(255)|用户与许可标识
version_|YES|Integer(10)|版本

##### 用户与角色（c1_user_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
role_code|YES|String(255)|角色编号
role_id|YES|String(255)|角色标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
user_code|YES|String(255)|用户编号
user_id|YES|String(255)|用户标识
user_role_id|NO|String(255)|用户与角色标识
version_|YES|Integer(10)|版本

##### 许可（c1_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
parent_code|YES|String(255)|父级编号
parent_tree_code|YES|String(1023)|父级树编号
parent_tree_id|YES|String(1023)|父级树标识
parent_tree_name|YES|String(1023)|父级树名称
permission_code|NO|String(255)|许可编号
permission_id|NO|String(255)|许可标识
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
type_code|YES|String(255)|类别编号(数据字典)
version_|YES|Integer(10)|版本

##### 角色（c1_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
parent_code|YES|String(255)|父级编号
parent_tree_code|YES|String(1023)|父级树编号
parent_tree_id|YES|String(1023)|父级树标识
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
role_code|NO|String(255)|角色编号
role_id|NO|String(255)|角色标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
type_code|YES|String(255)|类别编号(数据字典)
version_|YES|Integer(10)|版本

##### 角色与许可（c1_role_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
permission_code|YES|String(255)|许可编号
permission_id|YES|String(255)|许可标识
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
role_code|YES|String(255)|角色编号
role_id|YES|String(255)|角色标识
role_permission_id|NO|String(255)|角色与许可标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
version_|YES|Integer(10)|版本

##### 用户组（c1_user_group）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
parent_code|YES|String(255)|父级编号
parent_tree_code|YES|String(1023)|父级树编号
parent_tree_id|YES|String(1023)|父级树标识
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
type_code|YES|String(255)|类别编号(数据字典)
user_group_code|NO|String(255)|用户组编号
user_group_id|NO|String(255)|用户组标识
version_|YES|Integer(10)|版本

##### 用户组与许可（c1_user_group_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
permission_code|YES|String(255)|许可编号
permission_id|YES|String(255)|许可标识
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
user_group_code|YES|String(255)|用户组编号
user_group_id|YES|String(255)|用户组标识
user_group_permission_id|NO|String(255)|用户组与许可标识
version_|YES|Integer(10)|版本

##### 用户组与角色（c1_user_group_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
role_code|YES|String(255)|角色编号
role_id|YES|String(255)|角色标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
user_group_code|YES|String(255)|用户组编号
user_group_id|YES|String(255)|用户组标识
user_group_role_id|NO|String(255)|用户组与角色标识
version_|YES|Integer(10)|版本

##### 用户组与用户（c1_user_group_user）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
user_code|YES|String(255)|用户编号
user_group_code|YES|String(255)|用户组编号
user_group_id|YES|String(255)|用户组标识
user_group_user_id|NO|String(255)|用户组与用户标识
user_id|YES|String(255)|用户标识
version_|YES|Integer(10)|版本

##### 授权消费（c1_oauth_consumer）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
client_secret|YES|String(255)|客户端密钥
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
oauth_consumer_id|NO|String(255)|授权消费标识
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
version_|YES|Integer(10)|版本

##### 令牌信息（c1_token_info）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
client_id|YES|String(255)|客户端标识
created_by_code|YES|String(255)|创建人编号
created_by_id|YES|String(255)|创建人标识
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态编号(数据字典)
department_code|YES|String(255)|部门编号
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记编号(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|json数据
last_modified_by_code|YES|String(255)|最后修改人编号
last_modified_by_id|YES|String(255)|最后修改人标识
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织编号
personal_code|YES|String(255)|个人编号
personal_id|YES|String(255)|个人标识
scope|YES|String(511)|范围
site_code|YES|String(255)|站点编号
state_code|YES|String(255)|状态编号(数据字典)
system_info_code|YES|String(255)|系统信息编号
token_info_code|NO|String(255)|令牌信息编号
token_info_id|NO|String(255)|令牌信息标识
user_code|YES|String(255)|用户编号
user_id|YES|String(255)|用户标识
version_|YES|Integer(10)|版本
