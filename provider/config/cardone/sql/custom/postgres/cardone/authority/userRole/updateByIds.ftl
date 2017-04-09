UPDATE c1_user_role SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
user_role_id = ANY(string_to_array(:userRoleIds, ','))