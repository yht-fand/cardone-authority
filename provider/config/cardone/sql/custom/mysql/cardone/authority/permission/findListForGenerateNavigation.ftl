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