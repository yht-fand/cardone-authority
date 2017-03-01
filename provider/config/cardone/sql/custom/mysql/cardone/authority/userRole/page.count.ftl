SELECT
COUNT(1)
FROM `c1_user_role` t
LEFT JOIN `c1_user` ug ON(ug.`USER_CODE` = t.`USER_CODE`)
LEFT JOIN `c1_role` r ON(r.`ROLE_CODE` = t.`ROLE_CODE`)
<#include "page.where.ftl">