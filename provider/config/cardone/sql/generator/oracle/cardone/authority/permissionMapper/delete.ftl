DELETE FROM C1_PERMISSION_MAPPER
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>