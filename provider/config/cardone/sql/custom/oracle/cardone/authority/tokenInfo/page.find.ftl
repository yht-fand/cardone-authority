SELECT T.*
FROM C1_TOKEN_INFO t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)