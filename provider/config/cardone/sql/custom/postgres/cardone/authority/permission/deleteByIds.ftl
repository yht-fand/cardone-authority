DELETE FROM c1_permission WHERE
permission_id = ANY(string_to_array(:permissionIds, ','))