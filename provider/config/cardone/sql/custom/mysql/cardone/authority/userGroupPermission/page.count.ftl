SELECT
COUNT(1)
FROM `c1_user_group_permission` t
LEFT JOIN `c1_user_group` ug ON(ug.`USER_GROUP_CODE` = t.`USER_GROUP_CODE`)
LEFT JOIN `c1_permission` p ON(p.`PERMISSION_CODE` = t.`PERMISSION_CODE`)
<#include "page.where.ftl">