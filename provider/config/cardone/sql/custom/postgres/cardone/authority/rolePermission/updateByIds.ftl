UPDATE c1_role_permission SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
role_permission_id = ANY(string_to_array(:rolePermissionIds, ','))