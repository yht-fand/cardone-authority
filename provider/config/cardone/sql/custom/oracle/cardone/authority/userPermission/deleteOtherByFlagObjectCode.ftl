DELETE
FROM c1_user_permission
WHERE FLAG_CODE = :flagCode AND FLAG_OBJECT_CODE <> :flagObjectCode
<#if cardone.StringUtils.isNotBlank(userId)>
and user_id = :userId
</#if>
<#if cardone.StringUtils.isNotBlank(userCode)>
and user_code = :userCode
</#if>