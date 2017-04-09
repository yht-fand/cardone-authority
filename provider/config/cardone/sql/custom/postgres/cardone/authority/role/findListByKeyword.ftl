SELECT d.ROLE_CODE  ,d.NAME FROM c1_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.ROLE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.ROLE_CODE
LIMIT 20