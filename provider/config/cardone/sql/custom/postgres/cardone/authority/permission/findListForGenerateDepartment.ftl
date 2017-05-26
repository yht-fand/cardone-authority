SELECT
'department:view:*' AS "permissionCode",
NULL AS "parentCode",
NULL AS "parentTreeCode",
NULL AS "parentTreeName",
'department' AS "typeCode",
'generate' AS "flagCode",
'部门所有数据权限' AS "name",
NULL AS "beginDate",
NULL AS "endDate"
UNION ALL
SELECT
'department:view:'||COALESCE(t.DEPARTMENT_CODE, '') AS "permissionCode",
CASE WHEN (t.PARENT_CODE IS NULL OR t.PARENT_CODE = '') THEN 'department:view:*' ELSE 'department:view:'||COALESCE(t.PARENT_CODE, '') END AS "parentCode",
'department:view:'||COALESCE(t.PARENT_TREE_CODE, '') AS "parentTreeCode",
t.PARENT_TREE_NAME AS "parentTreeName",
'department' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_department t