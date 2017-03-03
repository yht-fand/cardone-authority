SELECT
'department:view:*' AS 'permissionCode',
NULL AS 'parentCode',
NULL AS 'parentTreeCode',
NULL AS 'parentTreeName',
'department' AS 'typeCode',
'generate' AS 'flagCode',
'部门所有数据权限' AS 'name',
NULL AS 'beginDate',
NULL AS 'endDate'
FROM DUAL
UNION ALL
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