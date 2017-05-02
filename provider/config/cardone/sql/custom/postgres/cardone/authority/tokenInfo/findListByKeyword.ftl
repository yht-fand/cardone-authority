SELECT d.TOKENINFO_CODE  ,d.NAME FROM c1_token_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.TOKENINFO_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.TOKENINFO_CODE
LIMIT 20