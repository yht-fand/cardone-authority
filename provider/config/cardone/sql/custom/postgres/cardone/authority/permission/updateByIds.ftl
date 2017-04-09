UPDATE c1_permission SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
permission_id = ANY(string_to_array(:permissionIds, ','))