SELECT
t.permission_code
, t.permission_id
, t.NAME
, t.PARENT_ID
, t.PARENT_CODE
, (select count(*) from c1_permission s where s.PARENT_ID = t.permission_id and t.state_code = '1' and t.data_state_code = '1') as children_count
FROM c1_permission t
WHERE t.state_code = '1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notId)>
    <#if cardone.StringUtils.isNotBlank(id)>
    AND t.PARENT_ID = :id
    <#else>
    AND t.PARENT_Id = ''
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.permission_code