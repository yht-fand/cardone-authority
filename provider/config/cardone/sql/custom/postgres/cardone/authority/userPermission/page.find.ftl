select
t.user_permission_id,
u.name as "user_name",
u.first_name as "user_first_name",
u.last_name as "user_last_name",
t.user_code,
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
from c1_user_permission t
left join c1_user u on(u.user_code = t.user_code)
left join c1_permission p on(p.permission_code = t.permission_code)
<#if cardone.StringUtils.isNotBlank(userPermissionId)>
where t.user_permission_id = :userPermissionId
<#else>
    <#include "page.where.ftl">
order by t.user_code,
t.permission_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>