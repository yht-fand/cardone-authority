DELETE FROM C1_USER_GROUP_PERMISSION
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>