select
count(1)
from c1_user_group_role t
left join c1_user_group ug on(ug.user_group_code = t.user_group_code)
left join c1_role p on(p.role_code = t.role_code)
<#include "page.where.ftl">