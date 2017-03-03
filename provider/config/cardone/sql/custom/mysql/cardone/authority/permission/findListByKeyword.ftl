SELECT d.PERMISSION_CODE  ,d.NAME FROM c1_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`PERMISSION_CODE`)
</#if>
ORDER BY d.ORDER_, d.PERMISSION_CODE
LIMIT 20