SELECT t.`FUNCTION_CODE`
FROM `t_function` t
JOIN `t_role_function` rf ON (rf.`FUNCTION_ID` = t.`ID`)
JOIN `t_user_role` ur ON (ur.`ROLE_ID` = rf.`ROLE_ID`)
JOIN `t_user` u ON (u.id = ur.`USER_ID`)
WHERE u.`USER_CODE` = :userCode