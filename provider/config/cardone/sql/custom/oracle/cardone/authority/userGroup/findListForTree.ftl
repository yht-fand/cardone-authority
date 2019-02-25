SELECT
t.user_group_id
, t.user_group_code
, t.NAME
, t.PARENT_ID
, t.PARENT_CODE
, (select count(*) from c1_user_group s where s.PARENT_ID = t.user_group_id and t.state_code = '1' and t.data_state_code = '1') as children_count
FROM c1_user_group t
WHERE t.state_code = '1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notId)>
    <#if cardone.StringUtils.isNotBlank(id)>
    AND t.PARENT_ID = :id
    <#else>
    AND t.PARENT_ID = ''
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.user_group_code