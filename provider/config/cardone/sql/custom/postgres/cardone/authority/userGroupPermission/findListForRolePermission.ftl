SELECT ugr.USER_GROUP_CODE AS "userGroupCode",
ugr.user_group_id AS "userGroupId",
t.PERMISSION_CODE AS "permissionCode",
t.permission_id AS "permissionId",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_role_permission t
JOIN c1_user_group_role ugr ON (ugr.ROLE_CODE = t.ROLE_CODE)