SELECT d.USERGROUPUSER_CODE  ,d.NAME FROM c1_user_group_user d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERGROUPUSER_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.USERGROUPUSER_CODE
LIMIT 20