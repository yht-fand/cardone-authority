SELECT
COUNT(1) AS COUNT_
FROM `c1_user_role` t
LEFT JOIN c1_role r ON (r.ROLE_CODE = t.ROLE_CODE)
LEFT JOIN c1_user u ON (u.USER_CODE = t.USER_CODE)
<#include "page.where.ftl">