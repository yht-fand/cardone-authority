SELECT t.user_group_code
, t.NAME
, t.PARENT_CODE
, (select count(*) from c1_dictionary_type s where s.PARENT_CODE = t.user_group_code) as children_count
FROM c1_user_group t
WHERE t.state_code = '1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notId)>
    <#if cardone.StringUtils.isNotBlank(id)>
    AND :id = ANY(string_to_array(t.PARENT_TREE_CODE, ','))
    <#else>
    AND t.PARENT_CODE = ''
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.user_group_code