SELECT
'user:view:*' AS 'permissionCode',
NULL AS 'parentCode',
NULL AS 'parentTreeCode',
NULL AS 'parentTreeName',
'department' AS 'typeCode',
'generate' AS 'flagCode',
'用户所有数据权限' AS 'name',
NULL AS 'beginDate',
NULL AS 'endDate'
FROM DUAL
UNION ALL
SELECT
CONCAT('user:view:', t.`USER_CODE`) AS 'permissionCode',
'user' AS 'typeCode',
'generate' AS 'flagCode',
t.`NAME` AS 'name',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_user` t