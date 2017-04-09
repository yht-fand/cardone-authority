SELECT d.USERGROUPPERMISSION_CODE  ,d.NAME FROM c1_user_group_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERGROUPPERMISSION_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.USERGROUPPERMISSION_CODE
LIMIT 20