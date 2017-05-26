SELECT ugu.USER_CODE AS "userCode",
t.PERMISSION_CODE AS "permissionCode",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user_group_permission t
JOIN c1_user_group_user ugu ON (ugu.USER_GROUP_CODE = t.USER_GROUP_CODE)