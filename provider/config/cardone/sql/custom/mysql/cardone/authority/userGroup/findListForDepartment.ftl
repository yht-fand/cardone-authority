SELECT t.`DEPARTMENT_CODE` AS 'userGroupCode',
t.`PARENT_CODE` AS 'parentCode',
t.`PARENT_TREE_CODE` AS 'parentTreeCode',
t.`PARENT_TREE_NAME` AS 'parentTreeName',
'department' AS 'typeCode',
t.`BEGIN_DATE` AS 'beginDate',
t.`END_DATE` AS 'endDate'
FROM `c1_department` t