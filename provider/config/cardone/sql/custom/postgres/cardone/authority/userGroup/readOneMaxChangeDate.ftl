select max(t.change_date) from (
select max(last_modified_date) as change_date from c1_user_role
where user_code = :userCode
union ALL
select max(last_modified_date) as change_date from c1_user_permission
where user_code = :userCode
) t