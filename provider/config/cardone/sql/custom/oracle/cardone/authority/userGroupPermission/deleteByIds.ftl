DELETE FROM C1_USER_GROUP_PERMISSION WHERE
INSTR(','||:userGroupPermissionIds||',', ','||USER_GROUP_PERMISSION_ID||',') > 0