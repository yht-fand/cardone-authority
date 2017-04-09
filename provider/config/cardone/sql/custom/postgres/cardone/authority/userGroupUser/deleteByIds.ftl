DELETE FROM c1_user_group_user WHERE
user_group_user_id = ANY(string_to_array(:userGroupUserIds, ','))