DELETE FROM c1_oauth_consumer WHERE
oauth_consumer_id = ANY(string_to_array(:oAuthConsumerIds, ','))