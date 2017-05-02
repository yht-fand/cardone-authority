SELECT d.USERPERMISSION_CODE  ,d.NAME FROM c1_user_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERPERMISSION_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.USERPERMISSION_CODE
LIMIT 20