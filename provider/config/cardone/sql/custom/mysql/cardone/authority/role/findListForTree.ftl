SELECT t.ROLE_CODE ,d.NAME, t.PARENT_CODE FROM c1_ROLE t
<#if cardone.StringUtils.isNotBlank(id)>
WHERE  FIND_IN_SET(:id, t.`PARENT_TREE_CODE`)
</#if>
ORDER BY t.ORDER_, t.ROLE_CODE