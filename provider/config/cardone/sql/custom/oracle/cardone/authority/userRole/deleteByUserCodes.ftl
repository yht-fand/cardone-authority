DELETE FROM c1_user_role WHERE
INSTR(','||:userCodes||',', ','||USER_CODE||',') > 0