DELETE FROM "c1_permission_mapper" WHERE
permission_mapper_id = ANY(string_to_array(:permissionMapperIds, ','))