DELETE FROM c1_dictionary
<#include "where.ftl">
<#if (((prefixName!) == 'WHERE') && !(delete_all??))>
${prefixName} 1 = 2
</#if>