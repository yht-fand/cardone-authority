SELECT
COUNT(1)
FROM `c1_role_permission` t
LEFT JOIN `c1_role` r ON(r.`ROLE_CODE` = t.`ROLE_CODE`)
LEFT JOIN `c1_permission` p ON(p.`PERMISSION_CODE` = t.`PERMISSION_CODE`)
<#include "page.where.ftl">