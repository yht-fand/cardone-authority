SELECT d.TOKENINFO_CODE  ,d.NAME FROM c1_token_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`TOKENINFO_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.TOKENINFO_CODE
LIMIT 20