UPDATE c1_token_info SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
token_info_id = ANY(string_to_array(:tokenInfoIds, ','))