UPDATE c1_oauth_consumer SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
oauth_consumer_id = ANY(string_to_array(:oAuthConsumerIds, ','))