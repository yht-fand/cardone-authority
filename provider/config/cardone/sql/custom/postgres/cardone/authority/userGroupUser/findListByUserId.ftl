select ugu.user_group_id
, ugu.user_id
, ug.user_group_code
, ug."name" as user_group_name
, u.user_code
, u."name" as user_name
from c1_user_group_user ugu
join c1_user_group ug on (ug.user_group_code = ugu.user_group_code)
join c1_user u on (u.user_id = ugu.user_id)
where ugu.user_id = :userId
and ugu.data_state_code = '1'
and ugu.state_code = '1'