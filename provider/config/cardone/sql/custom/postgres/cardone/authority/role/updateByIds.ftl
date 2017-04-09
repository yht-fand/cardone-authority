UPDATE c1_role SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
role_id = ANY(string_to_array(:roleIds, ','))