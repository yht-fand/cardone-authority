SELECT d.USERGROUPUSER_CODE  ,d.NAME FROM c1_user_group_user d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERGROUPUSER_CODE`)
</#if>
ORDER BY d.ORDER_, d.USERGROUPUSER_CODE
LIMIT 20