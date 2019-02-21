DELETE FROM C1_PERMISSION WHERE
INSTR(','||:permissionIds||',', ','||PERMISSION_ID||',') > 0
