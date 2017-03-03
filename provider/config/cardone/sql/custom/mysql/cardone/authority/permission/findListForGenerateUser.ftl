SELECT
CONCAT('user:view:', t.`USER_CODE`) AS 'permissionCode',
'user' AS 'typeCode',
'generate' AS 'flagCode',
t.`NAME` AS 'name',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_user` t