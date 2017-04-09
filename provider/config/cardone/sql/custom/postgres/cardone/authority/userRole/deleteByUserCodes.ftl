DELETE FROM c1_user_role WHERE
USER_CODE = ANY(string_to_array(:userCodes, ','))