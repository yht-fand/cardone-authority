DELETE FROM c1_user_role WHERE
user_role_id = ANY(string_to_array(:userRoleIds, ','))