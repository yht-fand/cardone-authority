select
count(1)
from c1_user_permission t
left join c1_user u on(u.user_code = t.user_code)
left join c1_permission p on(p.permission_code = t.permission_code)
<#include "page.where.ftl">