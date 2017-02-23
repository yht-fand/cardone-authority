<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.ROLE_CODE  ,d.NAME FROM c1_role d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ROLE_CODE`)
</#if>
ORDER BY d.ORDER_, d.ROLE_CODE
LIMIT 20