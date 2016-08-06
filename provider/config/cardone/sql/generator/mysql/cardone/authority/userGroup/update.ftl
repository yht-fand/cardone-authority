UPDATE c1_user_group
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (update_name??)>
${prefixName} `NAME` = :update_name_value
<#assign prefixName = ','>
</#if>
<#if (update_order??)>
${prefixName} `ORDER_` = :update_order_value
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (update_parentCode??)>
${prefixName} `PARENT_CODE` = :update_parentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_parentTreeCode??)>
${prefixName} `PARENT_TREE_CODE` = :update_parentTreeCode_value
<#assign prefixName = ','>
</#if>
<#if (update_parentTreeName??)>
${prefixName} `PARENT_TREE_NAME` = :update_parentTreeName_value
<#assign prefixName = ','>
</#if>
<#if (update_permissionCodes??)>
${prefixName} `PERMISSION_CODES` = :update_permissionCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_roleCodes??)>
${prefixName} `ROLE_CODES` = :update_roleCodes_value
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (update_userGroupCode??)>
${prefixName} `USER_GROUP_CODE` = :update_userGroupCode_value
<#assign prefixName = ','>
</#if>
<#if (update_userGroupId??)>
${prefixName} `USER_GROUP_ID` = :update_userGroupId_value
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
<#if (update_wfId??)>
${prefixName} `WF_ID` = :update_wfId_value
<#assign prefixName = ','>
</#if>
<#include "where.ftl">