DELETE FROM c1_user_group_role WHERE
user_group_role_id = ANY(string_to_array(:userGroupRoleIds, ','))