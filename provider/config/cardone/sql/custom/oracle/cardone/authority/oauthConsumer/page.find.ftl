SELECT T.*
FROM C1_OAUTH_CONSUMER t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)