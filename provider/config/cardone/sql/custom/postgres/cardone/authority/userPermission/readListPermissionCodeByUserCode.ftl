SELECT t.PERMISSION_CODE FROM c1_user_permission t
WHERE t.USER_CODE = :userCode
AND (NOW() BETWEEN t.BEGIN_DATE AND t.END_DATE)
