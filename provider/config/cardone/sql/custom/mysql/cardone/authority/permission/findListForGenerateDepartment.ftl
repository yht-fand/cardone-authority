SELECT
CONCAT('department:view:', t.`DEPARTMENT_CODE`) AS 'permissionCode',
CONCAT('department:view:', t.`PARENT_CODE`) AS 'parentCode',
CONCAT('department:view:', t.`PARENT_TREE_CODE`) AS 'parentTreeCode',
t.`PARENT_TREE_NAME` AS 'parentTreeName',
'department' AS 'typeCode',
'generate' AS 'flagCode',
t.`NAME` AS 'name',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_department` t