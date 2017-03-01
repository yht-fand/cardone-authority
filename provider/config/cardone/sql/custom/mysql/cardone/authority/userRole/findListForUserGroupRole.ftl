SELECT ugu.`USER_CODE` AS 'userCode',
t.`ROLE_CODE` AS 'roleCode',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_user_group_role` t
JOIN `c1_user_group_user` ugu ON (ugu.`USER_GROUP_CODE` = t.`USER_GROUP_CODE`)