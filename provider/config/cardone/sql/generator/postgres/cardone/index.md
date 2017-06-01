
### 权限(authority)

#### ER 图

![权限](authority.png)

#### 表结构

##### 用户与许可（c1_user_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
permission_code|YES|String(255)|许可代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
user_code|YES|String(255)|用户代码
user_permission_id|NO|String(255)|用户与许可标识
version_|YES|Integer(10)|版本

##### 用户与角色（c1_user_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
role_code|YES|String(255)|角色代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
user_code|YES|String(255)|用户代码
user_role_id|NO|String(255)|用户与角色标识
version_|YES|Integer(10)|版本

##### 许可（c1_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
parent_code|YES|String(255)|父级代码
parent_tree_code|YES|String(1023)|父级树代码
parent_tree_name|YES|String(1023)|父级树名称
permission_code|NO|String(255)|许可代码
permission_id|NO|String(255)|许可标识
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|YES|String(255)|类别代码(数据字典)
version_|YES|Integer(10)|版本

##### 角色（c1_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
parent_code|YES|String(255)|父级代码
parent_tree_code|YES|String(1023)|父级树代码
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人代码
role_code|NO|String(255)|角色代码
role_id|NO|String(255)|角色标识
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|YES|String(255)|类别代码(数据字典)
version_|YES|Integer(10)|版本

##### 角色与许可（c1_role_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
permission_code|YES|String(255)|许可代码
personal_code|YES|String(255)|个人代码
role_code|YES|String(255)|角色代码
role_permission_id|NO|String(255)|角色与许可标识
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
version_|YES|Integer(10)|版本

##### 用户组（c1_user_group）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
name|YES|String(255)|名称
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
parent_code|YES|String(255)|父级代码
parent_tree_code|YES|String(1023)|父级树代码
parent_tree_name|YES|String(1023)|父级树名称
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
type_code|YES|String(255)|类别代码(数据字典)
user_group_code|NO|String(255)|用户组代码
user_group_id|NO|String(255)|用户组标识
version_|YES|Integer(10)|版本

##### 用户组与许可（c1_user_group_permission）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
permission_code|YES|String(255)|许可代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
user_group_code|YES|String(255)|用户组代码
user_group_permission_id|NO|String(255)|用户组与许可标识
version_|YES|Integer(10)|版本

##### 用户组与角色（c1_user_group_role）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
role_code|YES|String(255)|角色代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
user_group_code|YES|String(255)|用户组代码
user_group_role_id|NO|String(255)|用户组与角色标识
version_|YES|Integer(10)|版本

##### 用户组与用户（c1_user_group_user）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
user_code|YES|String(255)|用户代码
user_group_code|YES|String(255)|用户组代码
user_group_user_id|NO|String(255)|用户组与用户标识
version_|YES|Integer(10)|版本

##### 授权消费（c1_oauth_consumer）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
client_secret|YES|String(255)|客户端密钥
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
oauth_consumer_id|NO|String(255)|授权消费标识
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
version_|YES|Integer(10)|版本

##### 令牌信息（c1_token_info）

字段名|可为空|类型及范围|说明
---|---|---|---
batch_no|YES|String(255)|批次编号
begin_date|YES|Date(29)|开始日期
client_id|YES|String(255)|客户端标识
created_by_code|YES|String(255)|创建人代码
created_date|YES|Date(29)|创建日期
data_state_code|YES|String(255)|数据状态代码(数据字典)
department_code|YES|String(255)|部门代码
end_date|YES|Date(29)|结束日期
flag_code|YES|String(255)|标记代码(数据字典：工作流、同步、生成、录入、审批)
flag_object_code|YES|String(255)|标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
json_data|YES|Object(2147483647)|JSON数据
last_modified_by_code|YES|String(255)|最后修改人代码
last_modified_date|YES|Date(29)|最后修改日期
order_by_|YES|Long(19)|排序
org_code|YES|String(255)|组织代码
personal_code|YES|String(255)|个人代码
scope|YES|String(511)|范围
site_code|YES|String(255)|站点代码
state_code|YES|String(255)|状态代码(数据字典)
system_info_code|YES|String(255)|系统信息代码
token_info_code|NO|String(255)|令牌信息代码
token_info_id|NO|String(255)|令牌信息标识
user_code|YES|String(255)|用户代码
version_|YES|Integer(10)|版本
