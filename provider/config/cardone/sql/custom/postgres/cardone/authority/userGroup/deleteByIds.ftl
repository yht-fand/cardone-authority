DELETE FROM c1_user_group WHERE
user_group_id = ANY(string_to_array(:userGroupIds, ','))