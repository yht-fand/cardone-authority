SELECT
t.permission_id,
t.permission_code,
t.name,
t.type_code,
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
c1_permission t
<#if cardone.StringUtils.isNotBlank(permissionId)>
WHERE t.permission_id = :permissionId
<#else>
    <#include "page.where.ftl">
ORDER BY t.PARENT_code,
t.permission_code,
t.CREATED_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>