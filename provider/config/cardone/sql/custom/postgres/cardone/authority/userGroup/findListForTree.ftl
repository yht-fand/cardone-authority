SELECT t.user_group_code, t.name , t.parent_code FROM c1_user_group t
<#if cardone.StringUtils.isNotBlank(id)>
WHERE :id = ANY(string_to_array(t.parent_tree_code, ','))
</#if>
ORDER BY t.ORDER_BY_, t.user_group_code