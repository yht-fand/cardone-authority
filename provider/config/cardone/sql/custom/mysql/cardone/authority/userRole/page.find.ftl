SELECT t.USER_CODE,
IFNULL(U.`NAME`, t.USER_CODE) AS USER_NAME,
GROUP_CONCAT(IFNULL(R.`NAME`, t.ROLE_CODE)) AS ROLE_NAMES
FROM `c1_user_role` t
LEFT JOIN c1_role r ON (r.ROLE_CODE = t.ROLE_CODE)
LEFT JOIN c1_user u ON (u.USER_CODE = t.USER_CODE)
<#include "page.where.ftl">
GROUP BY t.`USER_CODE`
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>