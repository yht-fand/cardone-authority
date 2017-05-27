select
count(1)
from c1_user_group_permission t
left join c1_user_group ug on(ug.user_group_code = t.user_group_code)
left join c1_permission p on(p.permission_code = t.permission_code)
<#include "page.where.ftl">