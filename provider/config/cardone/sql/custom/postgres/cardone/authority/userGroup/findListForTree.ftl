SELECT t.user_group_code, t.name , t.parent_code FROM c1_user_group t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isNotBlank(id)>
and :id = ANY(string_to_array(t.parent_tree_code, ','))
</#if>
ORDER BY t.ORDER_BY_, t.user_group_code