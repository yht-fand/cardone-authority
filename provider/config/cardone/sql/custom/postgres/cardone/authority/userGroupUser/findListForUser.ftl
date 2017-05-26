SELECT 'department_'||COALESCE(t.DEPARTMENT_CODE, '') as "userGroupCode",
t.USER_CODE as "userCode",
'department' as "typeCode",
'generate' as "flagCode",
t.BEGIN_DATE as "beginDate",
t.END_DATE as "endDate"
FROM c1_user t