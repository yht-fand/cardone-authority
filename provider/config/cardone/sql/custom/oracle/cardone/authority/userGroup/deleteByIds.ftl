DELETE FROM C1_USER_GROUP WHERE
INSTR(','||:userGroupIds||',', ','||USER_GROUP_ID||',') > 0
