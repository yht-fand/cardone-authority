SELECT ugu.USER_CODE AS "userCode",
ugu.user_id AS "userId",
t.PERMISSION_CODE AS "permissionCode",
t.permission_id AS "permissionId",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user_group_permission t
JOIN c1_user_group_user ugu ON (ugu.USER_GROUP_CODE = t.USER_GROUP_CODE)