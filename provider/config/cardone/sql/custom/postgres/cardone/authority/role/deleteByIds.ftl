DELETE FROM c1_role WHERE
role_id = ANY(string_to_array(:roleIds, ','))