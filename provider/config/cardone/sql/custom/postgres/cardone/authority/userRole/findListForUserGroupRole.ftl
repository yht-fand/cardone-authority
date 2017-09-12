SELECT ugu.USER_CODE AS "userCode",
ugu.user_id AS "userId",
t.ROLE_CODE AS "roleCode",
t.role_id AS "roleId",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user_group_role t
JOIN c1_user_group_user ugu ON (ugu.USER_GROUP_CODE = t.USER_GROUP_CODE)
where t.state_code ='1' and t.data_state_code = '1'
and ugu.state_code ='1' and ugu.data_state_code = '1'