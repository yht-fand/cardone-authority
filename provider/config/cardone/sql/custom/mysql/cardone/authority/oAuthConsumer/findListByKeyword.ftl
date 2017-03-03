SELECT d.OAUTHCONSUMER_CODE  ,d.NAME FROM c1_oauth_consumer d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`OAUTHCONSUMER_CODE`)
</#if>
ORDER BY d.ORDER_, d.OAUTHCONSUMER_CODE
LIMIT 20