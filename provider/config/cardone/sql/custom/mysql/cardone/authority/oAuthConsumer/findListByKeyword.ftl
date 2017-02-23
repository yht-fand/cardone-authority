<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.OAUTHCONSUMER_CODE  ,d.NAME FROM c1_oauth_consumer d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`OAUTHCONSUMER_CODE`)
</#if>
ORDER BY d.ORDER_, d.OAUTHCONSUMER_CODE
LIMIT 20