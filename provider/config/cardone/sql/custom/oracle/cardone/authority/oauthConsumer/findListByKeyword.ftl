SELECT t.OAUTH_CONSUMER_CODE, t.NAME FROM C1_OAUTH_CONSUMER t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (INSTR(t.NAME, :term) > 0 OR INSTR(t.OAUTH_CONSUMER_CODE, :term) > 0)
    </#if>
</#if>
and rownum <= 20
ORDER BY t.ORDER_BY_, t.OAUTH_CONSUMER_CODE