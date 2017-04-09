UPDATE c1_user_group_permission SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
user_group_permission_id = ANY(string_to_array(:userGroupPermissionIds, ','))