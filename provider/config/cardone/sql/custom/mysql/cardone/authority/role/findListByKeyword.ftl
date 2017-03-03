SELECT d.ROLE_CODE  ,d.NAME FROM c1_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ROLE_CODE`)
</#if>
ORDER BY d.ORDER_, d.ROLE_CODE
LIMIT 20