UPDATE c1_user_permission SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
user_permission_id = ANY(string_to_array(:userPermissionIds, ','))