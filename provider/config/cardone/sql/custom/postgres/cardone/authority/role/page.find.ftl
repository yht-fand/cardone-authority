select
t.role_id,
t.role_code,
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
from c1_role t
<#if cardone.StringUtils.isNotBlank(roleId)>
WHERE t.role_id = :roleId
<#else>
    <#include "page.where.ftl">
order by t.parent_code,
t.role_code,
t.created_date
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>