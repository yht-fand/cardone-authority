SELECT
COUNT(1)
FROM `c1_user_group_user` t
LEFT JOIN `c1_user_group` ug ON(ug.`USER_GROUP_CODE` = t.`USER_GROUP_CODE`)
LEFT JOIN `c1_user` u ON(u.`USER_CODE` = t.`USER_CODE`)
<#include "page.where.ftl">