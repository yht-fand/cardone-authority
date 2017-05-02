SELECT d.USERROLE_CODE  ,d.NAME FROM c1_user_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERROLE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.USERROLE_CODE
LIMIT 20