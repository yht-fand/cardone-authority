SELECT CONCAT('department_', t.`DEPARTMENT_CODE`) AS 'userGroupCode',
t.`USER_CODE` AS 'userCode',
'department' AS 'typeCode',
'generate' AS 'flagCode',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_user` t