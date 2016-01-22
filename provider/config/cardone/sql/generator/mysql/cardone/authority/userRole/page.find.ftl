SELECT
<#assign prefixName = ' '>
<#if (select_beginDate??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_flagCode??)>
${prefixName} `FLAG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_permissionCodes??)>
${prefixName} `PERMISSION_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_roleCode??)>
${prefixName} `ROLE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_roleCodes??)>
${prefixName} `ROLE_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_siteCode??)>
${prefixName} `SITE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_userCode??)>
${prefixName} `USER_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_userRoleId??)>
${prefixName} `USER_ROLE_ID`
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if (select_wfId??)>
${prefixName} `WF_ID`
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
  `BEGIN_DATE`
, `CREATED_BY_CODE`
, `CREATED_DATE`
, `DATA_STATE_CODE`
, `DEPARTMENT_CODE`
, `END_DATE`
, `FLAG_CODE`
, `LAST_MODIFIED_BY_CODE`
, `LAST_MODIFIED_DATE`
, `ORG_CODE`
, `PERMISSION_CODES`
, `ROLE_CODE`
, `ROLE_CODES`
, `SITE_CODE`
, `STATE_CODE`
, `SYSTEM_INFO_CODE`
, `USER_CODE`
, `USER_ROLE_ID`
, `VERSION_`
, `WF_ID`
</#if>
FROM t_user_role
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_beginDate??)>
${prefixName} `BEGIN_DATE` ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} `CREATED_BY_CODE` ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} `CREATED_DATE` ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} `END_DATE` ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagCode??)>
${prefixName} `FLAG_CODE` ${order_by_flagCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} `ORG_CODE` ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_permissionCodes??)>
${prefixName} `PERMISSION_CODES` ${order_by_permissionCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_roleCode??)>
${prefixName} `ROLE_CODE` ${order_by_roleCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_roleCodes??)>
${prefixName} `ROLE_CODES` ${order_by_roleCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_siteCode??)>
${prefixName} `SITE_CODE` ${order_by_siteCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} `STATE_CODE` ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` ${order_by_systemInfoCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userCode??)>
${prefixName} `USER_CODE` ${order_by_userCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_userRoleId??)>
${prefixName} `USER_ROLE_ID` ${order_by_userRoleId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} `VERSION_` ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_wfId??)>
${prefixName} `WF_ID` ${order_by_wfId_value!}
<#assign prefixName = ','>
</#if>
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>