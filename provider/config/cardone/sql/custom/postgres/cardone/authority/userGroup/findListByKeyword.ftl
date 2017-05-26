SELECT d.user_group_code  ,d.NAME FROM c1_user_group d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.user_group_code, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.user_group_code
LIMIT 20