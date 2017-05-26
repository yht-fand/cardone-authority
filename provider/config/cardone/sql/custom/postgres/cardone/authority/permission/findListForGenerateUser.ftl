SELECT
'user:view:*' AS "permissionCode",
NULL AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
'用户所有数据权限' AS "name",
NULL AS "beginDate",
NULL AS "endDate"
UNION ALL
SELECT
'user:view:'||COALESCE(t.USER_CODE, '') AS "permissionCode",
'user:view:*' AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user t