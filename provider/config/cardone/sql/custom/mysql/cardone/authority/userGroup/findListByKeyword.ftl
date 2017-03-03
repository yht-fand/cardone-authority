SELECT d.USER_GROUP_CODE  ,d.NAME FROM c1_user_group d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE FIND_IN_SET(:term, d.`PARENT_TREE_CODE`) OR LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`USER_GROUP_CODE`)
</#if>
ORDER BY d.ORDER_, d.USER_GROUP_CODE
LIMIT 20