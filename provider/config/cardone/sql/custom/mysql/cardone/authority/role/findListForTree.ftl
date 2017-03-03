SELECT d.ROLE_CODE ,d.NAME, d.PARENT_CODE FROM c1_ROLE d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE  FIND_IN_SET(:term, d.`PARENT_TREE_CODE`) OR LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ROLE_CODE`)
</#if>
ORDER BY d.ORDER_, d.ROLE_CODE