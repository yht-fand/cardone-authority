SELECT
t.user_group_id,
t.user_group_code,
t.name,
t.type_code,
t.parent_id,
t.parent_code,
t.parent_tree_name,
t.parent_tree_code,
t.created_by_code,
t.created_date,
t.last_modified_by_code,
t.last_modified_date,
t.begin_date,
t.end_date,
t.flag_code,
t.state_code,
t.data_state_code
FROM
c1_user_group t
<#if cardone.StringUtils.isNotBlank(userGroupId)>
WHERE t.user_group_id = :userGroupId
<#else>
    <#include "page.where.ftl">
ORDER BY t.PARENT_code,
t.user_group_code,
t.CREATED_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>