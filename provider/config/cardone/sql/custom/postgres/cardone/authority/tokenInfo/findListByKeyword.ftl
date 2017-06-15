SELECT t.TOKENINFO_CODE, t.NAME FROM c1_token_info t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.NAME, :term) > 0 OR strpos(t.TOKENINFO_CODE, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.TOKENINFO_CODE
LIMIT 20