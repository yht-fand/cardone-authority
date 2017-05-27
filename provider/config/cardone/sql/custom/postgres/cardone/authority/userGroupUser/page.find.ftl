select
t.user_group_user_id,
ug.parent_tree_name as "user_group_parent_tree_name",
ug.name as "user_group_name",
ug.parent_tree_code as "user_group_parent_tree_code",
t.user_group_code,
p.name as "user_name",
p.first_name as "user_first_name",
p.last_name as "user_last_name",
t.user_code,
t.created_by_code,
t.created_date,
t.last_modified_by_code,
t.last_modified_date,
t.begin_date,
t.end_date,
t.flag_code,
t.state_code,
t.data_state_code
from c1_user_group_user t
left join c1_user_group ug on(ug.user_group_code = t.user_group_code)
left join c1_user p on(p.user_code = t.user_code)
<#if cardone.StringUtils.isNotBlank(userGroupUserId)>
where t.user_group_user_id = :userGroupUserId
<#else>
    <#include "page.where.ftl">
order by t.user_group_code,
t.user_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>