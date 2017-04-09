DELETE FROM c1_user_permission WHERE
user_permission_id = ANY(string_to_array(:userPermissionIds, ','))