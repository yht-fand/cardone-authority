DELETE FROM c1_site
<#include "where.ftl">
<#if (((prefixName!) == 'WHERE') && !(delete_all??))>
${prefixName} 1 = 2
</#if>