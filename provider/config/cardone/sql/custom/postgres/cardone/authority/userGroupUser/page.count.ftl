select
count(1)
from c1_user_group_user t
left join c1_user_group ug on(ug.user_group_code = t.user_group_code)
left join c1_user p on(p.user_code = t.user_code)
<#include "page.where.ftl">