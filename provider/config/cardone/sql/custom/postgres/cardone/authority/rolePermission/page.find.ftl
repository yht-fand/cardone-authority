select
t.role_permission_id,
ug.parent_tree_name as "role_parent_tree_name",
ug.name as "role_name",
ug.parent_tree_code as "role_parent_tree_code",
t.role_code,
p.parent_tree_name as "permission_parent_tree_name",
p.name as "permission_name",
p.parent_tree_code as "permission_parent_tree_code",
t.permission_code,
t.created_by_code,
t.created_date,
t.last_modified_by_code,
t.last_modified_date,
t.begin_date,
t.end_date,
t.flag_code,
t.state_code,
t.data_state_code
from c1_role_permission t
left join c1_role ug on(ug.role_code = t.role_code)
left join c1_permission p on(p.permission_code = t.permission_code)
<#if cardone.StringUtils.isNotBlank(rolePermissionId)>
where t.role_permission_id = :rolePermissionId
<#else>
    <#include "page.where.ftl">
order by t.role_code,
t.permission_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>