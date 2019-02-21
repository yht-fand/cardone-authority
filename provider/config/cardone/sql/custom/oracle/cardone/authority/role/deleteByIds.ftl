DELETE FROM C1_ROLE WHERE
INSTR(','||:roleIds||',', ','||ROLE_ID||',') > 0
