UPDATE C1_PERMISSION_MAPPER SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:permissionMapperIds||',', ','||PERMISSION_MAPPER_ID||',') > 0