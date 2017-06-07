DELETE FROM c1_role_permission
<#include "where.ftl">
<#if (!prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>