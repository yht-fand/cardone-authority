<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.USERROLE_CODE  ,d.NAME FROM c1_user_role d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERROLE_CODE`)
</#if>
ORDER BY d.ORDER_, d.USERROLE_CODE
LIMIT 20