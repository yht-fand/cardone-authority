SELECT
<#switch (object_id!)>
<#case "beginDate">
BEGIN_DATE AS beginDate
<#break>
<#case "createdByCode">
CREATED_BY_CODE AS createdByCode
<#break>
<#case "createdDate">
CREATED_DATE AS createdDate
<#break>
<#case "dataStateCode">
DATA_STATE_CODE AS dataStateCode
<#break>
<#case "departmentCode">
DEPARTMENT_CODE AS departmentCode
<#break>
<#case "endDate">
END_DATE AS endDate
<#break>
<#case "lastModifiedByCode">
LAST_MODIFIED_BY_CODE AS lastModifiedByCode
<#break>
<#case "lastModifiedDate">
LAST_MODIFIED_DATE AS lastModifiedDate
<#break>
<#case "orgCode">
ORG_CODE AS orgCode
<#break>
<#case "permissionCode">
PERMISSION_CODE AS permissionCode
<#break>
<#case "permissionCodes">
PERMISSION_CODES AS permissionCodes
<#break>
<#case "roleCode">
ROLE_CODE AS roleCode
<#break>
<#case "roleCodes">
ROLE_CODES AS roleCodes
<#break>
<#case "rolePermissionId">
ROLE_PERMISSION_ID AS rolePermissionId
<#break>
<#case "stateCode">
STATE_CODE AS stateCode
<#break>
<#case "version">
VERSION_ AS version
<#break>
<#case "wfId">
WF_ID AS wfId
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM t_role_permission
<#include "where.ftl">