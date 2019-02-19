UPDATE "c1_permission_mapper" SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
permission_mapper_id = ANY(string_to_array(:permissionMapperIds, ','))