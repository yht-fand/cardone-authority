select
count(1)
from c1_user_role t
left join c1_user u on(u.user_code = t.user_code)
left join c1_role p on(p.role_code = t.role_code)
<#include "page.where.ftl">