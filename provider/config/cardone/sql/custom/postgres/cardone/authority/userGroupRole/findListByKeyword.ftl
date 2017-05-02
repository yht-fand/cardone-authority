SELECT d.USERGROUPROLE_CODE  ,d.NAME FROM c1_user_group_role d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.USERGROUPROLE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.USERGROUPROLE_CODE
LIMIT 20