SELECT d.ROLEPERMISSION_CODE  ,d.NAME FROM c1_role_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.ROLEPERMISSION_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.ROLEPERMISSION_CODE
LIMIT 20