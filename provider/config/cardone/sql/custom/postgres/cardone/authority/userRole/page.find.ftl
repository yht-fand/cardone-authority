select
t.user_role_id,
u.name as "user_name",
u.first_name as "user_first_name",
u.last_name as "user_last_name",
t.user_code,
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
from c1_user_role t
left join c1_user u on(u.user_code = t.user_code)
left join c1_role p on(p.role_code = t.role_code)
<#if cardone.StringUtils.isNotBlank(userRoleId)>
where t.user_role_id = :userRoleId
<#else>
    <#include "page.where.ftl">
order by t.user_code,
t.role_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>