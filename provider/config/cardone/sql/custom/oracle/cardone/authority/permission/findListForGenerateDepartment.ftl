SELECT
'department:view:*' AS "permissionId",
'department:view:*' AS "permissionCode",
'' AS "parentId",
'' AS "parentCode",
'' AS "parentTreeCode",
'' AS "parentTreeId",
'' AS "parentTreeName",
'department' AS "typeCode",
'generate' AS "flagCode",
'部门所有数据权限' AS "name",
'1999-01-01'::date AS "beginDate",
'9999-01-01'::date AS "endDate"
UNION ALL
SELECT
'department:view:'||COALESCE(t.DEPARTMENT_ID, '') AS "permissionId",
'department:view:'||COALESCE(t.DEPARTMENT_CODE, '') AS "permissionCode",
CASE WHEN (t.PARENT_ID IS NULL OR t.PARENT_ID = '') THEN 'department:view:*' ELSE 'department:view:'||COALESCE(t.PARENT_ID, '') END AS "parentId",
CASE WHEN (t.PARENT_CODE IS NULL OR t.PARENT_CODE = '') THEN 'department:view:*' ELSE 'department:view:'||COALESCE(t.PARENT_CODE, '') END AS "parentCode",
'department:view:'||COALESCE(t.parent_tree_id, '') AS "parentTreeId",
'department:view:'||COALESCE(t.PARENT_TREE_CODE, '') AS "parentTreeCode",
t.PARENT_TREE_NAME AS "parentTreeName",
'department' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_department t
where t.state_code ='1' and t.data_state_code = '1'