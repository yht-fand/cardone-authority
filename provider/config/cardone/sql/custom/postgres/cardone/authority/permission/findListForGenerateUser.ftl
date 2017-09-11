SELECT
'user:view:*' AS "permissionId",
'user:view:*' AS "permissionCode",
'' AS "parentId",
'' AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
'用户所有数据权限' AS "name",
'1999-01-01'::date AS "beginDate",
'9999-01-01'::date AS "endDate"
UNION ALL
SELECT
'user:view:'||COALESCE(t.USER_ID, '') AS "permissionId",
'user:view:'||COALESCE(t.USER_CODE, '') AS "permissionCode",
'user:view:*' AS "parentId",
'user:view:*' AS "parentCode",
'user' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user t