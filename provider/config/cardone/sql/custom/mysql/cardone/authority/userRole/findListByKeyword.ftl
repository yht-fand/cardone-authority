SELECT d.USERROLE_CODE, d.NAME FROM c1_user_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERROLE_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.USERROLE_CODE
LIMIT 20