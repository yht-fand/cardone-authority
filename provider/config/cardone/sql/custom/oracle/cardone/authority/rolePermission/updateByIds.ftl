UPDATE C1_ROLE_PERMISSION SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:rolePermissionIds||',', ','||ROLE_PERMISSION_ID||',') > 0