SELECT T.*
FROM C1_PERMISSION_MAPPER t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)