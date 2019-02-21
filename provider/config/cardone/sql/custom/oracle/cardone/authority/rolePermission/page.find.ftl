SELECT T.*
FROM C1_ROLE_PERMISSION t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)