SELECT d.USERGROUP_CODE  ,d.NAME FROM c1_user_group d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERGROUP_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.USERGROUP_CODE
LIMIT 20