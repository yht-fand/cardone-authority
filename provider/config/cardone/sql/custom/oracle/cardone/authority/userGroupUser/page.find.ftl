SELECT T.*
FROM C1_USER_GROUP_USER t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)