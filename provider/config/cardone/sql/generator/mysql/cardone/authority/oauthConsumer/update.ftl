UPDATE t_oauth_consumer
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
<#if (update_beginDate_value??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_clientId??)>
<#if (update_clientId_value??)>
${prefixName} `CLIENT_ID` = :update_clientId_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_clientSecret??)>
<#if (update_clientSecret_value??)>
${prefixName} `CLIENT_SECRET` = :update_clientSecret_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
<#if (update_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
<#if (update_createdDate_value??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
<#if (update_dataStateCode_value??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
<#if (update_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
<#if (update_endDate_value??)>
${prefixName} `END_DATE` = :update_endDate_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
<#if (update_lastModifiedByCode_value??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
<#if (update_lastModifiedDate_value??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_oauthConsumerId??)>
<#if (update_oauthConsumerId_value??)>
${prefixName} `OAUTH_CONSUMER_ID` = :update_oauthConsumerId_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
<#if (update_orgCode_value??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_permissionCodes??)>
<#if (update_permissionCodes_value??)>
${prefixName} `PERMISSION_CODES` = :update_permissionCodes_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_roleCodes??)>
<#if (update_roleCodes_value??)>
${prefixName} `ROLE_CODES` = :update_roleCodes_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
<#if (update_siteCode_value??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
<#if (update_stateCode_value??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
<#if (update_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
<#if (update_version_value??)>
${prefixName} `VERSION_` = :update_version_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_wfId??)>
<#if (update_wfId_value??)>
${prefixName} `WF_ID` = :update_wfId_value
</#if>
<#assign prefixName = ','>
</#if>
<#include "where.ftl">