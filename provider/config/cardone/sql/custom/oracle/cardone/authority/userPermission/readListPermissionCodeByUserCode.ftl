select up.PERMISSION_CODE from c1_user_permission up
where up.USER_CODE = :userCode
and up.PERMISSION_CODE LIKE :permission||'%'
AND (SYSDATE BETWEEN up.BEGIN_DATE AND up.END_DATE)