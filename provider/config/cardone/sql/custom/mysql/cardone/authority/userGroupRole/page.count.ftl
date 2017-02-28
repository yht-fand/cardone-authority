SELECT
COUNT(1)
FROM `c1_user_group_role` t
LEFT JOIN `c1_user_group` ug ON(ug.`USER_GROUP_CODE` = t.`USER_GROUP_CODE`)
LEFT JOIN `c1_role` r ON(r.`ROLE_CODE` = t.`ROLE_CODE`)
<#include "page.where.ftl">