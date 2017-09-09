select up.PERMISSION_CODE from c1_user_permission up
where up.USER_CODE = :userCode
and up.PERMISSION_CODE LIKE :permission||'%'
AND (NOW() >= up.BEGIN_DATE AND NOW() <= up.END_DATE)