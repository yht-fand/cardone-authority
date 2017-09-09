SELECT t.user_group_id, t.user_group_code, t.NAME FROM c1_user_group t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.NAME, :term) > 0 OR strpos(t.user_group_code, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.user_group_code
LIMIT 20