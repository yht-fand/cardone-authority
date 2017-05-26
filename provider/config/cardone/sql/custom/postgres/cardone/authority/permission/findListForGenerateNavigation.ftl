SELECT
'navigation:view:*' AS "permissionCode",
NULL AS "parentCode",
NULL AS "parentTreeCode",
NULL AS "parentTreeName",
'navigation' AS "typeCode",
'generate' AS "flagCode",
'导航所有数据权限' AS "name",
NULL AS "beginDate",
NULL AS "endDate"
UNION ALL
SELECT
'navigation:view:'||COALESCE(t.NAVIGATION_CODE, '') AS "permissionCode",
CASE WHEN (t.PARENT_CODE IS NULL OR t.PARENT_CODE = '') THEN 'navigation:view:*' ELSE 'navigation:view:'||COALESCE(t.PARENT_CODE, '') END AS "parentCode",
'navigation:view:'||COALESCE(t.PARENT_TREE_CODE, '') AS "parentTreeCode",
t.PARENT_TREE_NAME AS "parentTreeName",
'navigation' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_navigation t