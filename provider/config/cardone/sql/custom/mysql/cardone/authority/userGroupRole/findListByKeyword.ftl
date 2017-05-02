SELECT d.USERGROUPROLE_CODE  ,d.NAME FROM c1_user_group_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERGROUPROLE_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.USERGROUPROLE_CODE
LIMIT 20