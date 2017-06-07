DELETE FROM c1_user_permission
<#include "where.ftl">
<#if (!prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>