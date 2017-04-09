DELETE FROM c1_token_info WHERE
token_info_id = ANY(string_to_array(:tokenInfoIds, ','))