SELECT
'navigation:view:*' AS "permissionId",
'navigation:view:*' AS "permissionCode",
'' AS "parentId",
'' AS "parentCode",
'' AS "parentTreeCode",
'' AS "parentTreeId",
'' AS "parentTreeName",
'navigation' AS "typeCode",
'generate' AS "flagCode",
'导航所有数据权限' AS "name",
to_date('1999-01-01 01:01:01','yyyy-mm-dd,hh:mi:ss') AS "beginDate",
to_date('9999-01-01 01:01:01','yyyy-mm-dd,hh:mi:ss') AS "endDate"
from dual
UNION ALL
SELECT
'navigation:view:'||COALESCE(t.NAVIGATION_ID, '') AS "permissionId",
'navigation:view:'||COALESCE(t.NAVIGATION_CODE, '') AS "permissionCode",
CASE WHEN (t.PARENT_CODE IS NULL OR t.PARENT_ID = '') THEN 'navigation:view:*' ELSE 'navigation:view:'||COALESCE(t.PARENT_ID, '') END AS "parentId",
CASE WHEN (t.PARENT_CODE IS NULL OR t.PARENT_CODE = '') THEN 'navigation:view:*' ELSE 'navigation:view:'||COALESCE(t.PARENT_CODE, '') END AS "parentCode",
'navigation:view:'||COALESCE(t.parent_tree_id, '') AS "parentTreeId",
'navigation:view:'||COALESCE(t.PARENT_TREE_CODE, '') AS "parentTreeCode",
t.PARENT_TREE_NAME AS "parentTreeName",
'navigation' AS "typeCode",
'generate' AS "flagCode",
t.NAME AS "name",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_navigation t
where t.state_code ='1' and t.data_state_code = '1'