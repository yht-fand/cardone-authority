
-- 权限(authority)


-- 用户与许可（c1_user_permission）

--批次编号
drop index IF EXISTS idx_c1_user_permission_batch_no;
create index IF NOT EXISTS idx_c1_user_permission_batch_no ON c1_user_permission ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_permission_begin_date;
create index IF NOT EXISTS idx_c1_user_permission_begin_date ON c1_user_permission ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_permission_created_by_code;
create index IF NOT EXISTS idx_c1_user_permission_created_by_code ON c1_user_permission ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_permission_created_by_id;
create index IF NOT EXISTS idx_c1_user_permission_created_by_id ON c1_user_permission ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_permission_created_date;
create index IF NOT EXISTS idx_c1_user_permission_created_date ON c1_user_permission ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_permission_data_state_code;
create index IF NOT EXISTS idx_c1_user_permission_data_state_code ON c1_user_permission ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_permission_department_code;
create index IF NOT EXISTS idx_c1_user_permission_department_code ON c1_user_permission ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_permission_end_date;
create index IF NOT EXISTS idx_c1_user_permission_end_date ON c1_user_permission ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_permission_flag_code;
create index IF NOT EXISTS idx_c1_user_permission_flag_code ON c1_user_permission ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_permission_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_permission_last_modified_by_code ON c1_user_permission ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_permission_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_permission_last_modified_by_id ON c1_user_permission ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_permission_last_modified_date;
create index IF NOT EXISTS idx_c1_user_permission_last_modified_date ON c1_user_permission ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_user_permission_order_by_;
create index IF NOT EXISTS idx_c1_user_permission_order_by_ ON c1_user_permission ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_permission_org_code;
create index IF NOT EXISTS idx_c1_user_permission_org_code ON c1_user_permission ("org_code" varchar_pattern_ops);
--许可编号
drop index IF EXISTS idx_c1_user_permission_permission_code;
create index IF NOT EXISTS idx_c1_user_permission_permission_code ON c1_user_permission ("permission_code" varchar_pattern_ops);
--许可标识
drop index IF EXISTS idx_c1_user_permission_permission_id;
create index IF NOT EXISTS idx_c1_user_permission_permission_id ON c1_user_permission ("permission_id" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_permission_personal_code;
create index IF NOT EXISTS idx_c1_user_permission_personal_code ON c1_user_permission ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_permission_personal_id;
create index IF NOT EXISTS idx_c1_user_permission_personal_id ON c1_user_permission ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_permission_site_code;
create index IF NOT EXISTS idx_c1_user_permission_site_code ON c1_user_permission ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_permission_state_code;
create index IF NOT EXISTS idx_c1_user_permission_state_code ON c1_user_permission ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_permission_system_info_code;
create index IF NOT EXISTS idx_c1_user_permission_system_info_code ON c1_user_permission ("system_info_code" varchar_pattern_ops);
--用户编号
drop index IF EXISTS idx_c1_user_permission_user_code;
create index IF NOT EXISTS idx_c1_user_permission_user_code ON c1_user_permission ("user_code" varchar_pattern_ops);
--用户标识
drop index IF EXISTS idx_c1_user_permission_user_id;
create index IF NOT EXISTS idx_c1_user_permission_user_id ON c1_user_permission ("user_id" varchar_pattern_ops);
--用户与许可标识
drop index IF EXISTS idx_c1_user_permission_user_permission_id;
create index IF NOT EXISTS idx_c1_user_permission_user_permission_id ON c1_user_permission ("user_permission_id" varchar_pattern_ops);

-- 用户与角色（c1_user_role）

--批次编号
drop index IF EXISTS idx_c1_user_role_batch_no;
create index IF NOT EXISTS idx_c1_user_role_batch_no ON c1_user_role ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_role_begin_date;
create index IF NOT EXISTS idx_c1_user_role_begin_date ON c1_user_role ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_role_created_by_code;
create index IF NOT EXISTS idx_c1_user_role_created_by_code ON c1_user_role ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_role_created_by_id;
create index IF NOT EXISTS idx_c1_user_role_created_by_id ON c1_user_role ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_role_created_date;
create index IF NOT EXISTS idx_c1_user_role_created_date ON c1_user_role ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_role_data_state_code;
create index IF NOT EXISTS idx_c1_user_role_data_state_code ON c1_user_role ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_role_department_code;
create index IF NOT EXISTS idx_c1_user_role_department_code ON c1_user_role ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_role_end_date;
create index IF NOT EXISTS idx_c1_user_role_end_date ON c1_user_role ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_role_flag_code;
create index IF NOT EXISTS idx_c1_user_role_flag_code ON c1_user_role ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_role_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_role_last_modified_by_code ON c1_user_role ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_role_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_role_last_modified_by_id ON c1_user_role ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_role_last_modified_date;
create index IF NOT EXISTS idx_c1_user_role_last_modified_date ON c1_user_role ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_user_role_order_by_;
create index IF NOT EXISTS idx_c1_user_role_order_by_ ON c1_user_role ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_role_org_code;
create index IF NOT EXISTS idx_c1_user_role_org_code ON c1_user_role ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_role_personal_code;
create index IF NOT EXISTS idx_c1_user_role_personal_code ON c1_user_role ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_role_personal_id;
create index IF NOT EXISTS idx_c1_user_role_personal_id ON c1_user_role ("personal_id" varchar_pattern_ops);
--角色编号
drop index IF EXISTS idx_c1_user_role_role_code;
create index IF NOT EXISTS idx_c1_user_role_role_code ON c1_user_role ("role_code" varchar_pattern_ops);
--角色标识
drop index IF EXISTS idx_c1_user_role_role_id;
create index IF NOT EXISTS idx_c1_user_role_role_id ON c1_user_role ("role_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_role_site_code;
create index IF NOT EXISTS idx_c1_user_role_site_code ON c1_user_role ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_role_state_code;
create index IF NOT EXISTS idx_c1_user_role_state_code ON c1_user_role ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_role_system_info_code;
create index IF NOT EXISTS idx_c1_user_role_system_info_code ON c1_user_role ("system_info_code" varchar_pattern_ops);
--用户编号
drop index IF EXISTS idx_c1_user_role_user_code;
create index IF NOT EXISTS idx_c1_user_role_user_code ON c1_user_role ("user_code" varchar_pattern_ops);
--用户标识
drop index IF EXISTS idx_c1_user_role_user_id;
create index IF NOT EXISTS idx_c1_user_role_user_id ON c1_user_role ("user_id" varchar_pattern_ops);
--用户与角色标识
drop index IF EXISTS idx_c1_user_role_user_role_id;
create index IF NOT EXISTS idx_c1_user_role_user_role_id ON c1_user_role ("user_role_id" varchar_pattern_ops);

-- 许可（c1_permission）

--批次编号
drop index IF EXISTS idx_c1_permission_batch_no;
create index IF NOT EXISTS idx_c1_permission_batch_no ON c1_permission ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_permission_begin_date;
create index IF NOT EXISTS idx_c1_permission_begin_date ON c1_permission ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_permission_created_by_code;
create index IF NOT EXISTS idx_c1_permission_created_by_code ON c1_permission ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_permission_created_by_id;
create index IF NOT EXISTS idx_c1_permission_created_by_id ON c1_permission ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_permission_created_date;
create index IF NOT EXISTS idx_c1_permission_created_date ON c1_permission ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_permission_data_state_code;
create index IF NOT EXISTS idx_c1_permission_data_state_code ON c1_permission ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_permission_department_code;
create index IF NOT EXISTS idx_c1_permission_department_code ON c1_permission ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_permission_end_date;
create index IF NOT EXISTS idx_c1_permission_end_date ON c1_permission ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_permission_flag_code;
create index IF NOT EXISTS idx_c1_permission_flag_code ON c1_permission ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_permission_last_modified_by_code;
create index IF NOT EXISTS idx_c1_permission_last_modified_by_code ON c1_permission ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_permission_last_modified_by_id;
create index IF NOT EXISTS idx_c1_permission_last_modified_by_id ON c1_permission ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_permission_last_modified_date;
create index IF NOT EXISTS idx_c1_permission_last_modified_date ON c1_permission ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_permission_name;
create index IF NOT EXISTS idx_c1_permission_name ON c1_permission ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_permission_order_by_;
create index IF NOT EXISTS idx_c1_permission_order_by_ ON c1_permission ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_permission_org_code;
create index IF NOT EXISTS idx_c1_permission_org_code ON c1_permission ("org_code" varchar_pattern_ops);
--父级编号
drop index IF EXISTS idx_c1_permission_parent_code;
create index IF NOT EXISTS idx_c1_permission_parent_code ON c1_permission ("parent_code" varchar_pattern_ops);
--父级标识
drop index IF EXISTS idx_c1_permission_parent_id;
create index IF NOT EXISTS idx_c1_permission_parent_id ON c1_permission ("parent_id" varchar_pattern_ops);
--父级树编号
drop index IF EXISTS idx_c1_permission_parent_tree_code;
create index IF NOT EXISTS idx_c1_permission_parent_tree_code ON c1_permission ("parent_tree_code" varchar_pattern_ops);
--父级树标识
drop index IF EXISTS idx_c1_permission_parent_tree_id;
create index IF NOT EXISTS idx_c1_permission_parent_tree_id ON c1_permission ("parent_tree_id" varchar_pattern_ops);
--父级树名称
drop index IF EXISTS idx_c1_permission_parent_tree_name;
create index IF NOT EXISTS idx_c1_permission_parent_tree_name ON c1_permission ("parent_tree_name" varchar_pattern_ops);
--许可编号
drop index IF EXISTS idx_c1_permission_permission_code;
create index IF NOT EXISTS idx_c1_permission_permission_code ON c1_permission ("permission_code" varchar_pattern_ops);
--许可标识
drop index IF EXISTS idx_c1_permission_permission_id;
create index IF NOT EXISTS idx_c1_permission_permission_id ON c1_permission ("permission_id" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_permission_personal_code;
create index IF NOT EXISTS idx_c1_permission_personal_code ON c1_permission ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_permission_personal_id;
create index IF NOT EXISTS idx_c1_permission_personal_id ON c1_permission ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_permission_site_code;
create index IF NOT EXISTS idx_c1_permission_site_code ON c1_permission ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_permission_state_code;
create index IF NOT EXISTS idx_c1_permission_state_code ON c1_permission ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_permission_system_info_code;
create index IF NOT EXISTS idx_c1_permission_system_info_code ON c1_permission ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_permission_type_code;
create index IF NOT EXISTS idx_c1_permission_type_code ON c1_permission ("type_code" varchar_pattern_ops);

-- 角色（c1_role）

--批次编号
drop index IF EXISTS idx_c1_role_batch_no;
create index IF NOT EXISTS idx_c1_role_batch_no ON c1_role ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_role_begin_date;
create index IF NOT EXISTS idx_c1_role_begin_date ON c1_role ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_role_created_by_code;
create index IF NOT EXISTS idx_c1_role_created_by_code ON c1_role ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_role_created_by_id;
create index IF NOT EXISTS idx_c1_role_created_by_id ON c1_role ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_role_created_date;
create index IF NOT EXISTS idx_c1_role_created_date ON c1_role ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_role_data_state_code;
create index IF NOT EXISTS idx_c1_role_data_state_code ON c1_role ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_role_department_code;
create index IF NOT EXISTS idx_c1_role_department_code ON c1_role ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_role_end_date;
create index IF NOT EXISTS idx_c1_role_end_date ON c1_role ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_role_flag_code;
create index IF NOT EXISTS idx_c1_role_flag_code ON c1_role ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_role_last_modified_by_code;
create index IF NOT EXISTS idx_c1_role_last_modified_by_code ON c1_role ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_role_last_modified_by_id;
create index IF NOT EXISTS idx_c1_role_last_modified_by_id ON c1_role ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_role_last_modified_date;
create index IF NOT EXISTS idx_c1_role_last_modified_date ON c1_role ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_role_name;
create index IF NOT EXISTS idx_c1_role_name ON c1_role ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_role_order_by_;
create index IF NOT EXISTS idx_c1_role_order_by_ ON c1_role ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_role_org_code;
create index IF NOT EXISTS idx_c1_role_org_code ON c1_role ("org_code" varchar_pattern_ops);
--父级编号
drop index IF EXISTS idx_c1_role_parent_code;
create index IF NOT EXISTS idx_c1_role_parent_code ON c1_role ("parent_code" varchar_pattern_ops);
--父级标识
drop index IF EXISTS idx_c1_role_parent_id;
create index IF NOT EXISTS idx_c1_role_parent_id ON c1_role ("parent_id" varchar_pattern_ops);
--父级树编号
drop index IF EXISTS idx_c1_role_parent_tree_code;
create index IF NOT EXISTS idx_c1_role_parent_tree_code ON c1_role ("parent_tree_code" varchar_pattern_ops);
--父级树标识
drop index IF EXISTS idx_c1_role_parent_tree_id;
create index IF NOT EXISTS idx_c1_role_parent_tree_id ON c1_role ("parent_tree_id" varchar_pattern_ops);
--父级树名称
drop index IF EXISTS idx_c1_role_parent_tree_name;
create index IF NOT EXISTS idx_c1_role_parent_tree_name ON c1_role ("parent_tree_name" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_role_personal_code;
create index IF NOT EXISTS idx_c1_role_personal_code ON c1_role ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_role_personal_id;
create index IF NOT EXISTS idx_c1_role_personal_id ON c1_role ("personal_id" varchar_pattern_ops);
--角色编号
drop index IF EXISTS idx_c1_role_role_code;
create index IF NOT EXISTS idx_c1_role_role_code ON c1_role ("role_code" varchar_pattern_ops);
--角色标识
drop index IF EXISTS idx_c1_role_role_id;
create index IF NOT EXISTS idx_c1_role_role_id ON c1_role ("role_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_role_site_code;
create index IF NOT EXISTS idx_c1_role_site_code ON c1_role ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_role_state_code;
create index IF NOT EXISTS idx_c1_role_state_code ON c1_role ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_role_system_info_code;
create index IF NOT EXISTS idx_c1_role_system_info_code ON c1_role ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_role_type_code;
create index IF NOT EXISTS idx_c1_role_type_code ON c1_role ("type_code" varchar_pattern_ops);

-- 角色与许可（c1_role_permission）

--批次编号
drop index IF EXISTS idx_c1_role_permission_batch_no;
create index IF NOT EXISTS idx_c1_role_permission_batch_no ON c1_role_permission ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_role_permission_begin_date;
create index IF NOT EXISTS idx_c1_role_permission_begin_date ON c1_role_permission ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_role_permission_created_by_code;
create index IF NOT EXISTS idx_c1_role_permission_created_by_code ON c1_role_permission ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_role_permission_created_by_id;
create index IF NOT EXISTS idx_c1_role_permission_created_by_id ON c1_role_permission ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_role_permission_created_date;
create index IF NOT EXISTS idx_c1_role_permission_created_date ON c1_role_permission ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_role_permission_data_state_code;
create index IF NOT EXISTS idx_c1_role_permission_data_state_code ON c1_role_permission ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_role_permission_department_code;
create index IF NOT EXISTS idx_c1_role_permission_department_code ON c1_role_permission ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_role_permission_end_date;
create index IF NOT EXISTS idx_c1_role_permission_end_date ON c1_role_permission ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_role_permission_flag_code;
create index IF NOT EXISTS idx_c1_role_permission_flag_code ON c1_role_permission ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_role_permission_last_modified_by_code;
create index IF NOT EXISTS idx_c1_role_permission_last_modified_by_code ON c1_role_permission ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_role_permission_last_modified_by_id;
create index IF NOT EXISTS idx_c1_role_permission_last_modified_by_id ON c1_role_permission ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_role_permission_last_modified_date;
create index IF NOT EXISTS idx_c1_role_permission_last_modified_date ON c1_role_permission ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_role_permission_order_by_;
create index IF NOT EXISTS idx_c1_role_permission_order_by_ ON c1_role_permission ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_role_permission_org_code;
create index IF NOT EXISTS idx_c1_role_permission_org_code ON c1_role_permission ("org_code" varchar_pattern_ops);
--许可编号
drop index IF EXISTS idx_c1_role_permission_permission_code;
create index IF NOT EXISTS idx_c1_role_permission_permission_code ON c1_role_permission ("permission_code" varchar_pattern_ops);
--许可标识
drop index IF EXISTS idx_c1_role_permission_permission_id;
create index IF NOT EXISTS idx_c1_role_permission_permission_id ON c1_role_permission ("permission_id" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_role_permission_personal_code;
create index IF NOT EXISTS idx_c1_role_permission_personal_code ON c1_role_permission ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_role_permission_personal_id;
create index IF NOT EXISTS idx_c1_role_permission_personal_id ON c1_role_permission ("personal_id" varchar_pattern_ops);
--角色编号
drop index IF EXISTS idx_c1_role_permission_role_code;
create index IF NOT EXISTS idx_c1_role_permission_role_code ON c1_role_permission ("role_code" varchar_pattern_ops);
--角色标识
drop index IF EXISTS idx_c1_role_permission_role_id;
create index IF NOT EXISTS idx_c1_role_permission_role_id ON c1_role_permission ("role_id" varchar_pattern_ops);
--角色与许可标识
drop index IF EXISTS idx_c1_role_permission_role_permission_id;
create index IF NOT EXISTS idx_c1_role_permission_role_permission_id ON c1_role_permission ("role_permission_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_role_permission_site_code;
create index IF NOT EXISTS idx_c1_role_permission_site_code ON c1_role_permission ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_role_permission_state_code;
create index IF NOT EXISTS idx_c1_role_permission_state_code ON c1_role_permission ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_role_permission_system_info_code;
create index IF NOT EXISTS idx_c1_role_permission_system_info_code ON c1_role_permission ("system_info_code" varchar_pattern_ops);

-- 用户组（c1_user_group）

--批次编号
drop index IF EXISTS idx_c1_user_group_batch_no;
create index IF NOT EXISTS idx_c1_user_group_batch_no ON c1_user_group ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_group_begin_date;
create index IF NOT EXISTS idx_c1_user_group_begin_date ON c1_user_group ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_group_created_by_code;
create index IF NOT EXISTS idx_c1_user_group_created_by_code ON c1_user_group ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_group_created_by_id;
create index IF NOT EXISTS idx_c1_user_group_created_by_id ON c1_user_group ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_group_created_date;
create index IF NOT EXISTS idx_c1_user_group_created_date ON c1_user_group ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_data_state_code;
create index IF NOT EXISTS idx_c1_user_group_data_state_code ON c1_user_group ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_group_department_code;
create index IF NOT EXISTS idx_c1_user_group_department_code ON c1_user_group ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_group_end_date;
create index IF NOT EXISTS idx_c1_user_group_end_date ON c1_user_group ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_group_flag_code;
create index IF NOT EXISTS idx_c1_user_group_flag_code ON c1_user_group ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_group_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_group_last_modified_by_code ON c1_user_group ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_group_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_group_last_modified_by_id ON c1_user_group ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_group_last_modified_date;
create index IF NOT EXISTS idx_c1_user_group_last_modified_date ON c1_user_group ("last_modified_date");
--名称
drop index IF EXISTS idx_c1_user_group_name;
create index IF NOT EXISTS idx_c1_user_group_name ON c1_user_group ("name" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_user_group_order_by_;
create index IF NOT EXISTS idx_c1_user_group_order_by_ ON c1_user_group ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_group_org_code;
create index IF NOT EXISTS idx_c1_user_group_org_code ON c1_user_group ("org_code" varchar_pattern_ops);
--父级编号
drop index IF EXISTS idx_c1_user_group_parent_code;
create index IF NOT EXISTS idx_c1_user_group_parent_code ON c1_user_group ("parent_code" varchar_pattern_ops);
--父级标识
drop index IF EXISTS idx_c1_user_group_parent_id;
create index IF NOT EXISTS idx_c1_user_group_parent_id ON c1_user_group ("parent_id" varchar_pattern_ops);
--父级树编号
drop index IF EXISTS idx_c1_user_group_parent_tree_code;
create index IF NOT EXISTS idx_c1_user_group_parent_tree_code ON c1_user_group ("parent_tree_code" varchar_pattern_ops);
--父级树标识
drop index IF EXISTS idx_c1_user_group_parent_tree_id;
create index IF NOT EXISTS idx_c1_user_group_parent_tree_id ON c1_user_group ("parent_tree_id" varchar_pattern_ops);
--父级树名称
drop index IF EXISTS idx_c1_user_group_parent_tree_name;
create index IF NOT EXISTS idx_c1_user_group_parent_tree_name ON c1_user_group ("parent_tree_name" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_group_personal_code;
create index IF NOT EXISTS idx_c1_user_group_personal_code ON c1_user_group ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_group_personal_id;
create index IF NOT EXISTS idx_c1_user_group_personal_id ON c1_user_group ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_group_site_code;
create index IF NOT EXISTS idx_c1_user_group_site_code ON c1_user_group ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_state_code;
create index IF NOT EXISTS idx_c1_user_group_state_code ON c1_user_group ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_group_system_info_code;
create index IF NOT EXISTS idx_c1_user_group_system_info_code ON c1_user_group ("system_info_code" varchar_pattern_ops);
--类别编号(数据字典)
drop index IF EXISTS idx_c1_user_group_type_code;
create index IF NOT EXISTS idx_c1_user_group_type_code ON c1_user_group ("type_code" varchar_pattern_ops);
--用户组编号
drop index IF EXISTS idx_c1_user_group_user_group_code;
create index IF NOT EXISTS idx_c1_user_group_user_group_code ON c1_user_group ("user_group_code" varchar_pattern_ops);
--用户组标识
drop index IF EXISTS idx_c1_user_group_user_group_id;
create index IF NOT EXISTS idx_c1_user_group_user_group_id ON c1_user_group ("user_group_id" varchar_pattern_ops);

-- 用户组与许可（c1_user_group_permission）

--批次编号
drop index IF EXISTS idx_c1_user_group_permission_batch_no;
create index IF NOT EXISTS idx_c1_user_group_permission_batch_no ON c1_user_group_permission ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_group_permission_begin_date;
create index IF NOT EXISTS idx_c1_user_group_permission_begin_date ON c1_user_group_permission ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_group_permission_created_by_code;
create index IF NOT EXISTS idx_c1_user_group_permission_created_by_code ON c1_user_group_permission ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_group_permission_created_by_id;
create index IF NOT EXISTS idx_c1_user_group_permission_created_by_id ON c1_user_group_permission ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_group_permission_created_date;
create index IF NOT EXISTS idx_c1_user_group_permission_created_date ON c1_user_group_permission ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_permission_data_state_code;
create index IF NOT EXISTS idx_c1_user_group_permission_data_state_code ON c1_user_group_permission ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_group_permission_department_code;
create index IF NOT EXISTS idx_c1_user_group_permission_department_code ON c1_user_group_permission ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_group_permission_end_date;
create index IF NOT EXISTS idx_c1_user_group_permission_end_date ON c1_user_group_permission ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_group_permission_flag_code;
create index IF NOT EXISTS idx_c1_user_group_permission_flag_code ON c1_user_group_permission ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_group_permission_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_group_permission_last_modified_by_code ON c1_user_group_permission ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_group_permission_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_group_permission_last_modified_by_id ON c1_user_group_permission ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_group_permission_last_modified_date;
create index IF NOT EXISTS idx_c1_user_group_permission_last_modified_date ON c1_user_group_permission ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_user_group_permission_order_by_;
create index IF NOT EXISTS idx_c1_user_group_permission_order_by_ ON c1_user_group_permission ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_group_permission_org_code;
create index IF NOT EXISTS idx_c1_user_group_permission_org_code ON c1_user_group_permission ("org_code" varchar_pattern_ops);
--许可编号
drop index IF EXISTS idx_c1_user_group_permission_permission_code;
create index IF NOT EXISTS idx_c1_user_group_permission_permission_code ON c1_user_group_permission ("permission_code" varchar_pattern_ops);
--许可标识
drop index IF EXISTS idx_c1_user_group_permission_permission_id;
create index IF NOT EXISTS idx_c1_user_group_permission_permission_id ON c1_user_group_permission ("permission_id" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_group_permission_personal_code;
create index IF NOT EXISTS idx_c1_user_group_permission_personal_code ON c1_user_group_permission ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_group_permission_personal_id;
create index IF NOT EXISTS idx_c1_user_group_permission_personal_id ON c1_user_group_permission ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_group_permission_site_code;
create index IF NOT EXISTS idx_c1_user_group_permission_site_code ON c1_user_group_permission ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_permission_state_code;
create index IF NOT EXISTS idx_c1_user_group_permission_state_code ON c1_user_group_permission ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_group_permission_system_info_code;
create index IF NOT EXISTS idx_c1_user_group_permission_system_info_code ON c1_user_group_permission ("system_info_code" varchar_pattern_ops);
--用户组编号
drop index IF EXISTS idx_c1_user_group_permission_user_group_code;
create index IF NOT EXISTS idx_c1_user_group_permission_user_group_code ON c1_user_group_permission ("user_group_code" varchar_pattern_ops);
--用户组标识
drop index IF EXISTS idx_c1_user_group_permission_user_group_id;
create index IF NOT EXISTS idx_c1_user_group_permission_user_group_id ON c1_user_group_permission ("user_group_id" varchar_pattern_ops);
--用户组与许可标识
drop index IF EXISTS idx_c1_user_group_permission_user_group_permission_id;
create index IF NOT EXISTS idx_c1_user_group_permission_user_group_permission_id ON c1_user_group_permission ("user_group_permission_id" varchar_pattern_ops);

-- 用户组与角色（c1_user_group_role）

--批次编号
drop index IF EXISTS idx_c1_user_group_role_batch_no;
create index IF NOT EXISTS idx_c1_user_group_role_batch_no ON c1_user_group_role ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_group_role_begin_date;
create index IF NOT EXISTS idx_c1_user_group_role_begin_date ON c1_user_group_role ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_group_role_created_by_code;
create index IF NOT EXISTS idx_c1_user_group_role_created_by_code ON c1_user_group_role ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_group_role_created_by_id;
create index IF NOT EXISTS idx_c1_user_group_role_created_by_id ON c1_user_group_role ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_group_role_created_date;
create index IF NOT EXISTS idx_c1_user_group_role_created_date ON c1_user_group_role ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_role_data_state_code;
create index IF NOT EXISTS idx_c1_user_group_role_data_state_code ON c1_user_group_role ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_group_role_department_code;
create index IF NOT EXISTS idx_c1_user_group_role_department_code ON c1_user_group_role ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_group_role_end_date;
create index IF NOT EXISTS idx_c1_user_group_role_end_date ON c1_user_group_role ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_group_role_flag_code;
create index IF NOT EXISTS idx_c1_user_group_role_flag_code ON c1_user_group_role ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_group_role_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_group_role_last_modified_by_code ON c1_user_group_role ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_group_role_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_group_role_last_modified_by_id ON c1_user_group_role ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_group_role_last_modified_date;
create index IF NOT EXISTS idx_c1_user_group_role_last_modified_date ON c1_user_group_role ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_user_group_role_order_by_;
create index IF NOT EXISTS idx_c1_user_group_role_order_by_ ON c1_user_group_role ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_group_role_org_code;
create index IF NOT EXISTS idx_c1_user_group_role_org_code ON c1_user_group_role ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_group_role_personal_code;
create index IF NOT EXISTS idx_c1_user_group_role_personal_code ON c1_user_group_role ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_group_role_personal_id;
create index IF NOT EXISTS idx_c1_user_group_role_personal_id ON c1_user_group_role ("personal_id" varchar_pattern_ops);
--角色编号
drop index IF EXISTS idx_c1_user_group_role_role_code;
create index IF NOT EXISTS idx_c1_user_group_role_role_code ON c1_user_group_role ("role_code" varchar_pattern_ops);
--角色标识
drop index IF EXISTS idx_c1_user_group_role_role_id;
create index IF NOT EXISTS idx_c1_user_group_role_role_id ON c1_user_group_role ("role_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_group_role_site_code;
create index IF NOT EXISTS idx_c1_user_group_role_site_code ON c1_user_group_role ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_role_state_code;
create index IF NOT EXISTS idx_c1_user_group_role_state_code ON c1_user_group_role ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_group_role_system_info_code;
create index IF NOT EXISTS idx_c1_user_group_role_system_info_code ON c1_user_group_role ("system_info_code" varchar_pattern_ops);
--用户组编号
drop index IF EXISTS idx_c1_user_group_role_user_group_code;
create index IF NOT EXISTS idx_c1_user_group_role_user_group_code ON c1_user_group_role ("user_group_code" varchar_pattern_ops);
--用户组标识
drop index IF EXISTS idx_c1_user_group_role_user_group_id;
create index IF NOT EXISTS idx_c1_user_group_role_user_group_id ON c1_user_group_role ("user_group_id" varchar_pattern_ops);
--用户组与角色标识
drop index IF EXISTS idx_c1_user_group_role_user_group_role_id;
create index IF NOT EXISTS idx_c1_user_group_role_user_group_role_id ON c1_user_group_role ("user_group_role_id" varchar_pattern_ops);

-- 用户组与用户（c1_user_group_user）

--批次编号
drop index IF EXISTS idx_c1_user_group_user_batch_no;
create index IF NOT EXISTS idx_c1_user_group_user_batch_no ON c1_user_group_user ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_user_group_user_begin_date;
create index IF NOT EXISTS idx_c1_user_group_user_begin_date ON c1_user_group_user ("begin_date");
--创建人编号
drop index IF EXISTS idx_c1_user_group_user_created_by_code;
create index IF NOT EXISTS idx_c1_user_group_user_created_by_code ON c1_user_group_user ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_user_group_user_created_by_id;
create index IF NOT EXISTS idx_c1_user_group_user_created_by_id ON c1_user_group_user ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_user_group_user_created_date;
create index IF NOT EXISTS idx_c1_user_group_user_created_date ON c1_user_group_user ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_user_data_state_code;
create index IF NOT EXISTS idx_c1_user_group_user_data_state_code ON c1_user_group_user ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_user_group_user_department_code;
create index IF NOT EXISTS idx_c1_user_group_user_department_code ON c1_user_group_user ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_user_group_user_end_date;
create index IF NOT EXISTS idx_c1_user_group_user_end_date ON c1_user_group_user ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_user_group_user_flag_code;
create index IF NOT EXISTS idx_c1_user_group_user_flag_code ON c1_user_group_user ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_user_group_user_last_modified_by_code;
create index IF NOT EXISTS idx_c1_user_group_user_last_modified_by_code ON c1_user_group_user ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_user_group_user_last_modified_by_id;
create index IF NOT EXISTS idx_c1_user_group_user_last_modified_by_id ON c1_user_group_user ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_user_group_user_last_modified_date;
create index IF NOT EXISTS idx_c1_user_group_user_last_modified_date ON c1_user_group_user ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_user_group_user_order_by_;
create index IF NOT EXISTS idx_c1_user_group_user_order_by_ ON c1_user_group_user ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_user_group_user_org_code;
create index IF NOT EXISTS idx_c1_user_group_user_org_code ON c1_user_group_user ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_user_group_user_personal_code;
create index IF NOT EXISTS idx_c1_user_group_user_personal_code ON c1_user_group_user ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_user_group_user_personal_id;
create index IF NOT EXISTS idx_c1_user_group_user_personal_id ON c1_user_group_user ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_user_group_user_site_code;
create index IF NOT EXISTS idx_c1_user_group_user_site_code ON c1_user_group_user ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_user_group_user_state_code;
create index IF NOT EXISTS idx_c1_user_group_user_state_code ON c1_user_group_user ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_user_group_user_system_info_code;
create index IF NOT EXISTS idx_c1_user_group_user_system_info_code ON c1_user_group_user ("system_info_code" varchar_pattern_ops);
--用户编号
drop index IF EXISTS idx_c1_user_group_user_user_code;
create index IF NOT EXISTS idx_c1_user_group_user_user_code ON c1_user_group_user ("user_code" varchar_pattern_ops);
--用户组编号
drop index IF EXISTS idx_c1_user_group_user_user_group_code;
create index IF NOT EXISTS idx_c1_user_group_user_user_group_code ON c1_user_group_user ("user_group_code" varchar_pattern_ops);
--用户组标识
drop index IF EXISTS idx_c1_user_group_user_user_group_id;
create index IF NOT EXISTS idx_c1_user_group_user_user_group_id ON c1_user_group_user ("user_group_id" varchar_pattern_ops);
--用户组与用户标识
drop index IF EXISTS idx_c1_user_group_user_user_group_user_id;
create index IF NOT EXISTS idx_c1_user_group_user_user_group_user_id ON c1_user_group_user ("user_group_user_id" varchar_pattern_ops);
--用户标识
drop index IF EXISTS idx_c1_user_group_user_user_id;
create index IF NOT EXISTS idx_c1_user_group_user_user_id ON c1_user_group_user ("user_id" varchar_pattern_ops);

-- 授权消费（c1_oauth_consumer）

--批次编号
drop index IF EXISTS idx_c1_oauth_consumer_batch_no;
create index IF NOT EXISTS idx_c1_oauth_consumer_batch_no ON c1_oauth_consumer ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_oauth_consumer_begin_date;
create index IF NOT EXISTS idx_c1_oauth_consumer_begin_date ON c1_oauth_consumer ("begin_date");
--客户端密钥
drop index IF EXISTS idx_c1_oauth_consumer_client_secret;
create index IF NOT EXISTS idx_c1_oauth_consumer_client_secret ON c1_oauth_consumer ("client_secret" varchar_pattern_ops);
--创建人编号
drop index IF EXISTS idx_c1_oauth_consumer_created_by_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_created_by_code ON c1_oauth_consumer ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_oauth_consumer_created_by_id;
create index IF NOT EXISTS idx_c1_oauth_consumer_created_by_id ON c1_oauth_consumer ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_oauth_consumer_created_date;
create index IF NOT EXISTS idx_c1_oauth_consumer_created_date ON c1_oauth_consumer ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_oauth_consumer_data_state_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_data_state_code ON c1_oauth_consumer ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_oauth_consumer_department_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_department_code ON c1_oauth_consumer ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_oauth_consumer_end_date;
create index IF NOT EXISTS idx_c1_oauth_consumer_end_date ON c1_oauth_consumer ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_oauth_consumer_flag_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_flag_code ON c1_oauth_consumer ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_oauth_consumer_last_modified_by_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_last_modified_by_code ON c1_oauth_consumer ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_oauth_consumer_last_modified_by_id;
create index IF NOT EXISTS idx_c1_oauth_consumer_last_modified_by_id ON c1_oauth_consumer ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_oauth_consumer_last_modified_date;
create index IF NOT EXISTS idx_c1_oauth_consumer_last_modified_date ON c1_oauth_consumer ("last_modified_date");
--授权消费标识
drop index IF EXISTS idx_c1_oauth_consumer_oauth_consumer_id;
create index IF NOT EXISTS idx_c1_oauth_consumer_oauth_consumer_id ON c1_oauth_consumer ("oauth_consumer_id" varchar_pattern_ops);
--排序
drop index IF EXISTS idx_c1_oauth_consumer_order_by_;
create index IF NOT EXISTS idx_c1_oauth_consumer_order_by_ ON c1_oauth_consumer ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_oauth_consumer_org_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_org_code ON c1_oauth_consumer ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_oauth_consumer_personal_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_personal_code ON c1_oauth_consumer ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_oauth_consumer_personal_id;
create index IF NOT EXISTS idx_c1_oauth_consumer_personal_id ON c1_oauth_consumer ("personal_id" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_oauth_consumer_site_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_site_code ON c1_oauth_consumer ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_oauth_consumer_state_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_state_code ON c1_oauth_consumer ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_oauth_consumer_system_info_code;
create index IF NOT EXISTS idx_c1_oauth_consumer_system_info_code ON c1_oauth_consumer ("system_info_code" varchar_pattern_ops);

-- 令牌信息（c1_token_info）

--批次编号
drop index IF EXISTS idx_c1_token_info_batch_no;
create index IF NOT EXISTS idx_c1_token_info_batch_no ON c1_token_info ("batch_no" varchar_pattern_ops);
--开始日期
drop index IF EXISTS idx_c1_token_info_begin_date;
create index IF NOT EXISTS idx_c1_token_info_begin_date ON c1_token_info ("begin_date");
--客户端标识
drop index IF EXISTS idx_c1_token_info_client_id;
create index IF NOT EXISTS idx_c1_token_info_client_id ON c1_token_info ("client_id" varchar_pattern_ops);
--创建人编号
drop index IF EXISTS idx_c1_token_info_created_by_code;
create index IF NOT EXISTS idx_c1_token_info_created_by_code ON c1_token_info ("created_by_code" varchar_pattern_ops);
--创建人标识
drop index IF EXISTS idx_c1_token_info_created_by_id;
create index IF NOT EXISTS idx_c1_token_info_created_by_id ON c1_token_info ("created_by_id" varchar_pattern_ops);
--创建日期
drop index IF EXISTS idx_c1_token_info_created_date;
create index IF NOT EXISTS idx_c1_token_info_created_date ON c1_token_info ("created_date");
--数据状态编号(数据字典)
drop index IF EXISTS idx_c1_token_info_data_state_code;
create index IF NOT EXISTS idx_c1_token_info_data_state_code ON c1_token_info ("data_state_code" varchar_pattern_ops);
--部门编号
drop index IF EXISTS idx_c1_token_info_department_code;
create index IF NOT EXISTS idx_c1_token_info_department_code ON c1_token_info ("department_code" varchar_pattern_ops);
--结束日期
drop index IF EXISTS idx_c1_token_info_end_date;
create index IF NOT EXISTS idx_c1_token_info_end_date ON c1_token_info ("end_date");
--标记编号(数据字典：工作流、同步、生成、录入、审批)
drop index IF EXISTS idx_c1_token_info_flag_code;
create index IF NOT EXISTS idx_c1_token_info_flag_code ON c1_token_info ("flag_code" varchar_pattern_ops);
--最后修改人编号
drop index IF EXISTS idx_c1_token_info_last_modified_by_code;
create index IF NOT EXISTS idx_c1_token_info_last_modified_by_code ON c1_token_info ("last_modified_by_code" varchar_pattern_ops);
--最后修改人标识
drop index IF EXISTS idx_c1_token_info_last_modified_by_id;
create index IF NOT EXISTS idx_c1_token_info_last_modified_by_id ON c1_token_info ("last_modified_by_id" varchar_pattern_ops);
--最后修改日期
drop index IF EXISTS idx_c1_token_info_last_modified_date;
create index IF NOT EXISTS idx_c1_token_info_last_modified_date ON c1_token_info ("last_modified_date");
--排序
drop index IF EXISTS idx_c1_token_info_order_by_;
create index IF NOT EXISTS idx_c1_token_info_order_by_ ON c1_token_info ("order_by_");
--组织编号
drop index IF EXISTS idx_c1_token_info_org_code;
create index IF NOT EXISTS idx_c1_token_info_org_code ON c1_token_info ("org_code" varchar_pattern_ops);
--个人编号
drop index IF EXISTS idx_c1_token_info_personal_code;
create index IF NOT EXISTS idx_c1_token_info_personal_code ON c1_token_info ("personal_code" varchar_pattern_ops);
--个人标识
drop index IF EXISTS idx_c1_token_info_personal_id;
create index IF NOT EXISTS idx_c1_token_info_personal_id ON c1_token_info ("personal_id" varchar_pattern_ops);
--范围
drop index IF EXISTS idx_c1_token_info_scope;
create index IF NOT EXISTS idx_c1_token_info_scope ON c1_token_info ("scope" varchar_pattern_ops);
--站点编号
drop index IF EXISTS idx_c1_token_info_site_code;
create index IF NOT EXISTS idx_c1_token_info_site_code ON c1_token_info ("site_code" varchar_pattern_ops);
--状态编号(数据字典)
drop index IF EXISTS idx_c1_token_info_state_code;
create index IF NOT EXISTS idx_c1_token_info_state_code ON c1_token_info ("state_code" varchar_pattern_ops);
--系统信息编号
drop index IF EXISTS idx_c1_token_info_system_info_code;
create index IF NOT EXISTS idx_c1_token_info_system_info_code ON c1_token_info ("system_info_code" varchar_pattern_ops);
--令牌信息编号
drop index IF EXISTS idx_c1_token_info_token_info_code;
create index IF NOT EXISTS idx_c1_token_info_token_info_code ON c1_token_info ("token_info_code" varchar_pattern_ops);
--令牌信息标识
drop index IF EXISTS idx_c1_token_info_token_info_id;
create index IF NOT EXISTS idx_c1_token_info_token_info_id ON c1_token_info ("token_info_id" varchar_pattern_ops);
--用户编号
drop index IF EXISTS idx_c1_token_info_user_code;
create index IF NOT EXISTS idx_c1_token_info_user_code ON c1_token_info ("user_code" varchar_pattern_ops);
--用户标识
drop index IF EXISTS idx_c1_token_info_user_id;
create index IF NOT EXISTS idx_c1_token_info_user_id ON c1_token_info ("user_id" varchar_pattern_ops);


