UPDATE C1_ROLE SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:roleIds||',', ','||ROLE_ID||',') > 0