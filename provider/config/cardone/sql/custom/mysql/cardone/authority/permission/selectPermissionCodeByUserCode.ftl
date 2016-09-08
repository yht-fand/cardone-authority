SELECT t.`PERMISSION_CODE` FROM `c1_role_permission` t
JOIN `c1_user_role` ur ON (ur.`ROLE_CODE` = t.`ROLE_CODE`)
WHERE ur.`USER_CODE` = :userCode