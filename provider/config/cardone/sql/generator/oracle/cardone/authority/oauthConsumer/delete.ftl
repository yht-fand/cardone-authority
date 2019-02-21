DELETE FROM C1_OAUTH_CONSUMER
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>