SELECT
'navigation:view:*' AS 'permissionCode',
NULL AS 'parentCode',
NULL AS 'parentTreeCode',
NULL AS 'parentTreeName',
'department' AS 'typeCode',
'generate' AS 'flagCode',
'导航所有数据权限' AS 'name',
NULL AS 'beginDate',
NULL AS 'endDate'
FROM DUAL
UNION ALL
SELECT
CONCAT('navigation:view:', t.`NAVIGATION_CODE`) AS 'permissionCode',
CONCAT('navigation:view:', t.`PARENT_CODE`) AS 'parentCode',
CONCAT('navigation:view:', t.`PARENT_TREE_CODE`) AS 'parentTreeCode',
t.`PARENT_TREE_NAME` AS 'parentTreeName',
'navigation' AS 'typeCode',
'generate' AS 'flagCode',
t.`NAME` AS 'name',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_navigation` t