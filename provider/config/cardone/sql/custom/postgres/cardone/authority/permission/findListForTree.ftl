SELECT t.permission_code, t.NAME , t.parent_code FROM c1_permission t
<#if cardone.StringUtils.isNotBlank(id)>
WHERE :id = ANY(string_to_array(t.parent_tree_code, ','))
</#if>
ORDER BY t.ORDER_BY_, t.permission_code