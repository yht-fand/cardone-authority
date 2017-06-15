SELECT t.OAUTHCONSUMER_CODE, t.NAME FROM c1_oauth_consumer t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.NAME, :term) > 0 OR strpos(t.OAUTHCONSUMER_CODE, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.OAUTHCONSUMER_CODE
LIMIT 20