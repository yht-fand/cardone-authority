SELECT ugr.USER_GROUP_CODE AS "userGroupCode",
ugr.user_group_id AS "userGroupId",
t.permission_id AS "permissionId",
t.PERMISSION_CODE AS "permissionCode",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_role_permission t
JOIN c1_user_group_role ugr ON (ugr.ROLE_CODE = t.ROLE_CODE)
where t.state_code ='1' and t.data_state_code = '1'
and ugr.state_code ='1' and ugr.data_state_code = '1'