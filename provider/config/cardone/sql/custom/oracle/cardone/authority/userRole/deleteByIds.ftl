DELETE FROM C1_USER_ROLE WHERE
INSTR(','||:userRoleIds||',', ','||USER_ROLE_ID||',') > 0
