SELECT t.`USER_GROUP_CODE` AS 'userGroupCode',
rp.`PERMISSION_CODE` AS 'permissionCode',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_user_group` t
JOIN `c1_user_group_role` ugr ON (ugr.`USER_GROUP_CODE` = t.`USER_GROUP_CODE`)
JOIN `c1_role_permission` rp ON (rp.`ROLE_CODE` = ugr.`ROLE_CODE`)