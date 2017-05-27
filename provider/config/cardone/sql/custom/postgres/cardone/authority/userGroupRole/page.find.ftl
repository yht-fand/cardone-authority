select
t.user_group_role_id,
ug.parent_tree_name as "user_group_parent_tree_name",
ug.name as "user_group_name",
ug.parent_tree_code as "user_group_parent_tree_code",
t.user_group_code,
p.parent_tree_name as "role_parent_tree_name",
p.name as "role_name",
p.parent_tree_code as "role_parent_tree_code",
t.role_code,
t.created_by_code,
t.created_date,
t.last_modified_by_code,
t.last_modified_date,
t.begin_date,
t.end_date,
t.flag_code,
t.state_code,
t.data_state_code
from c1_user_group_role t
left join c1_user_group ug on(ug.user_group_code = t.user_group_code)
left join c1_role p on(p.role_code = t.role_code)
<#if cardone.StringUtils.isNotBlank(userGroupRoleId)>
where t.user_group_role_id = :userGroupRoleId
<#else>
    <#include "page.where.ftl">
order by t.user_group_code,
t.role_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>