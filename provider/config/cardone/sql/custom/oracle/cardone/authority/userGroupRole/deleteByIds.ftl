DELETE FROM C1_USER_GROUP_ROLE WHERE
INSTR(','||:userGroupRoleIds||',', ','||USER_GROUP_ROLE_ID||',') > 0
