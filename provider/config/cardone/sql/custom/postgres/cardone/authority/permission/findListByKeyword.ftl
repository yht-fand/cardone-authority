SELECT d.PERMISSION_CODE  ,d.NAME FROM c1_permission d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.PERMISSION_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.PERMISSION_CODE
LIMIT 20