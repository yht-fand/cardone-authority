SELECT d.USERPERMISSION_CODE  ,d.NAME FROM c1_user_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERPERMISSION_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.USERPERMISSION_CODE
LIMIT 20