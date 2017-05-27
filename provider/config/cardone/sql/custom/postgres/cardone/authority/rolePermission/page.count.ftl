select
count(1)
from c1_role_permission t
left join c1_role ug on(ug.role_code = t.role_code)
left join c1_permission p on(p.permission_code = t.permission_code)
<#include "page.where.ftl">