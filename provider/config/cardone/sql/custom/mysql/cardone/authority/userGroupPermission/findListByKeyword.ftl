<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.USERGROUPPERMISSION_CODE  ,d.NAME FROM c1_user_group_permission d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERGROUPPERMISSION_CODE`)
</#if>
ORDER BY d.ORDER_, d.USERGROUPPERMISSION_CODE
LIMIT 20