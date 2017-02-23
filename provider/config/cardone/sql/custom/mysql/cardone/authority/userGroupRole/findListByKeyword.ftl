<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.USERGROUPROLE_CODE  ,d.NAME FROM c1_user_group_role d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USERGROUPROLE_CODE`)
</#if>
ORDER BY d.ORDER_, d.USERGROUPROLE_CODE
LIMIT 20