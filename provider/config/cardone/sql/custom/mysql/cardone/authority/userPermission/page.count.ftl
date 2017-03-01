SELECT
COUNT(1)
FROM `c1_user_permission` t
LEFT JOIN `c1_user` r ON(r.`USER_CODE` = t.`USER_CODE`)
LEFT JOIN `c1_permission` p ON(p.`PERMISSION_CODE` = t.`PERMISSION_CODE`)
<#include "page.where.ftl">