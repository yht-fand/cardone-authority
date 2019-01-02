SELECT DISTINCT ugu.USER_CODE AS "userCode",
ugu.user_id AS "userId",
t.PERMISSION_CODE AS "permissionCode",
t.permission_id AS "permissionId",
'generate' AS "flagCode",
t.BEGIN_DATE AS "beginDate",
t.END_DATE AS "endDate"
FROM c1_user_group_permission t
JOIN c1_user_group_user ugu ON (ugu.USER_GROUP_CODE = t.USER_GROUP_CODE)
where t.state_code ='1' and t.data_state_code = '1'
and ugu.state_code ='1' and ugu.data_state_code = '1'
<#if cardone.StringUtils.isNotBlank(userId)>
and ugu.user_id = :userId
</#if>
<#if cardone.StringUtils.isNotBlank(userCode)>
and ugu.user_code = :userCode
</#if>
limit 400000