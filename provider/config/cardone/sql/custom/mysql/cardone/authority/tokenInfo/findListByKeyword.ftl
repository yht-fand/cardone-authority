<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.TOKENINFO_CODE  ,d.NAME FROM c1_token_info d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`TOKENINFO_CODE`)
</#if>
ORDER BY d.ORDER_, d.TOKENINFO_CODE
LIMIT 20