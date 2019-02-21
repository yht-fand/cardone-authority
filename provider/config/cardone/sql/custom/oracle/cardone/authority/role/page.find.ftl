SELECT T.*
FROM C1_ROLE t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)