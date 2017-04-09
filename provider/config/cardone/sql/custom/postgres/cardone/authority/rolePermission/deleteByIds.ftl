DELETE FROM c1_role_permission WHERE
role_permission_id = ANY(string_to_array(:rolePermissionIds, ','))