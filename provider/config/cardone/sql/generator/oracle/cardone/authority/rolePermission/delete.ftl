DELETE FROM C1_ROLE_PERMISSION
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>