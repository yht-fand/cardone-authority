SELECT (SELECT string_agg(REPLACE(up.PERMISSION_CODE, (:functionCode||':view-department:'), ''), ',') FROM c1_user_permission up
WHERE up.USER_CODE = :userCode AND up.PERMISSION_CODE LIKE (:functionCode||':view-department:'||'%')
AND (NOW() >= up.BEGIN_DATE AND NOW() <= up.END_DATE)) AS permission_departments,
(SELECT string_agg(REPLACE(up.PERMISSION_CODE, (:functionCode||':view-department:'), ''), ',') FROM c1_user_permission up
WHERE up.USER_CODE = :userCode AND up.PERMISSION_CODE LIKE (:functionCode||':view-user:'||'%')
AND (NOW() >= up.BEGIN_DATE AND NOW() <= up.END_DATE)) AS permission_users,
(SELECT string_agg(REPLACE(up.PERMISSION_CODE, (:functionCode||':view-department:'), ''), ',') FROM c1_user_permission up
WHERE up.USER_CODE = :userCode AND up.PERMISSION_CODE LIKE (:functionCode||':view:'||'%')
AND (NOW() >= up.BEGIN_DATE AND NOW() <= up.END_DATE)) AS permissions