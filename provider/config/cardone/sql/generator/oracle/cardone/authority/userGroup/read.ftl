SELECT
<#switch (object_id!)>
<#case "batchNo">
BATCH_NO
<#break>
<#case "beginDate">
BEGIN_DATE
<#break>
<#case "createdByCode">
CREATED_BY_CODE
<#break>
<#case "createdById">
CREATED_BY_ID
<#break>
<#case "createdDate">
CREATED_DATE
<#break>
<#case "dataStateCode">
DATA_STATE_CODE
<#break>
<#case "departmentCode">
DEPARTMENT_CODE
<#break>
<#case "endDate">
END_DATE
<#break>
<#case "flagCode">
FLAG_CODE
<#break>
<#case "flagObjectCode">
FLAG_OBJECT_CODE
<#break>
<#case "jsonData">
JSON_DATA
<#break>
<#case "lastModifiedByCode">
LAST_MODIFIED_BY_CODE
<#break>
<#case "lastModifiedById">
LAST_MODIFIED_BY_ID
<#break>
<#case "lastModifiedDate">
LAST_MODIFIED_DATE
<#break>
<#case "name">
NAME
<#break>
<#case "orderBy">
ORDER_BY_
<#break>
<#case "orgCode">
ORG_CODE
<#break>
<#case "parentCode">
PARENT_CODE
<#break>
<#case "parentId">
PARENT_ID
<#break>
<#case "parentTreeCode">
PARENT_TREE_CODE
<#break>
<#case "parentTreeId">
PARENT_TREE_ID
<#break>
<#case "parentTreeName">
PARENT_TREE_NAME
<#break>
<#case "personalCode">
PERSONAL_CODE
<#break>
<#case "personalId">
PERSONAL_ID
<#break>
<#case "siteCode">
SITE_CODE
<#break>
<#case "stateCode">
STATE_CODE
<#break>
<#case "systemInfoCode">
SYSTEM_INFO_CODE
<#break>
<#case "typeCode">
TYPE_CODE
<#break>
<#case "userGroupCode">
USER_GROUP_CODE
<#break>
<#case "userGroupId">
USER_GROUP_ID
<#break>
<#case "version">
VERSION_
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM C1_USER_GROUP
<#include "where.ftl">