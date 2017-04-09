SELECT d.OAUTHCONSUMER_CODE  ,d.NAME FROM c1_oauth_consumer d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.OAUTHCONSUMER_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.OAUTHCONSUMER_CODE
LIMIT 20