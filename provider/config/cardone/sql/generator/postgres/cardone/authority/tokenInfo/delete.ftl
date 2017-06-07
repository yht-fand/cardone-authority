DELETE FROM c1_token_info
<#include "where.ftl">
<#if (!prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>