SELECT
COUNT(1)
FROM `c1_user_group` t
left join `c1_user_group` p on (p.`USER_GROUP_CODE` = t.`PARENT_CODE`)
<#include "page.where.ftl">