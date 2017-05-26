SELECT 'department_'||t.DEPARTMENT_CODE AS "userGroupCode",
t.NAME AS "name",
'department_'||t.PARENT_CODE AS "parentCode",
'department_'||t.PARENT_TREE_CODE AS "parentTreeCode",
t.PARENT_TREE_NAME AS "parentTreeName",
'department' AS "typeCode",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_department t