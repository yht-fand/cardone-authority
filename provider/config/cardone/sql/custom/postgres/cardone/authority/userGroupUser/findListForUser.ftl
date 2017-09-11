SELECT 'general-group' as "userGroupCode",
'general-group' as "userGroupId",
t.USER_CODE as "userCode",
t.user_id as "userId",
'department' as "typeCode",
'generate' as "flagCode",
t.BEGIN_DATE as "beginDate",
t.END_DATE as "endDate"
FROM c1_user t