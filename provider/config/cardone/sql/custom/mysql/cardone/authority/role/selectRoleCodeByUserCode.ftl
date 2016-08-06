SELECT t.`ROLE_CODE`
FROM `t_role` t
JOIN `t_user_role` ur ON (ur.`ROLE_ID` = t.`ID`)
JOIN `t_user` u ON (u.id = ur.`USER_ID`)
WHERE u.`USER_CODE` = :userCode