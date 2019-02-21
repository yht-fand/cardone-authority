DELETE FROM C1_TOKEN_INFO WHERE
INSTR(','||:tokenInfoIds||',', ','||TOKEN_INFO_ID||',') > 0
