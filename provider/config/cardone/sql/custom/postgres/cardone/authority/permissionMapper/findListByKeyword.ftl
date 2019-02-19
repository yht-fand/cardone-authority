SELECT t.PERMISSION_MAPPER_CODE, t.NAME FROM "c1_permission_mapper" t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.NAME, :term) > 0 OR strpos(t.PERMISSION_MAPPER_CODE, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_, t.PERMISSION_MAPPER_CODE
LIMIT 20