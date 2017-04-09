DELETE FROM c1_user_group_permission WHERE
user_group_permission_id = ANY(string_to_array(:userGroupPermissionIds, ','))