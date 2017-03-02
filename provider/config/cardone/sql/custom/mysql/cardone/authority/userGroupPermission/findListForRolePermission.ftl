SELECT ugr.`USER_GROUP_CODE` AS 'userGroupCode',
t.`PERMISSION_CODE` AS 'permissionCode',
'generate' AS 'flagCode',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_role_permission` t
JOIN `c1_user_group_role` ugr ON (ugr.`ROLE_CODE` = t.`ROLE_CODE`)