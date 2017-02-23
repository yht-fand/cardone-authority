<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.USERPERMISSION_CODE  ,d.NAME FROM c1_user_permission d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERPERMISSION_CODE`)
</#if>
ORDER BY d.ORDER_, d.USERPERMISSION_CODE
LIMIT 20