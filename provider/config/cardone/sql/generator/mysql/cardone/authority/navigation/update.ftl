UPDATE t_navigation
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
<#if (update_beginDate_value??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
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
<#if (update_dataOption??)>
<#if (update_dataOption_value??)>
${prefixName} `DATA_OPTION` = :update_dataOption_value
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
<#if (update_iconStyle??)>
<#if (update_iconStyle_value??)>
${prefixName} `ICON_STYLE` = :update_iconStyle_value
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
<#if (update_name??)>
<#if (update_name_value??)>
${prefixName} `NAME` = :update_name_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_navigationCode??)>
<#if (update_navigationCode_value??)>
${prefixName} `NAVIGATION_CODE` = :update_navigationCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_navigationId??)>
<#if (update_navigationId_value??)>
${prefixName} `NAVIGATION_ID` = :update_navigationId_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_order??)>
<#if (update_order_value??)>
${prefixName} `ORDER_` = :update_order_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
<#if (update_orgCode_value??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_parentCode??)>
<#if (update_parentCode_value??)>
${prefixName} `PARENT_CODE` = :update_parentCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_parentTreeCode??)>
<#if (update_parentTreeCode_value??)>
${prefixName} `PARENT_TREE_CODE` = :update_parentTreeCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_parentTreeName??)>
<#if (update_parentTreeName_value??)>
${prefixName} `PARENT_TREE_NAME` = :update_parentTreeName_value
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
<#if (update_target??)>
<#if (update_target_value??)>
${prefixName} `TARGET` = :update_target_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_typeCode??)>
<#if (update_typeCode_value??)>
${prefixName} `TYPE_CODE` = :update_typeCode_value
</#if>
<#assign prefixName = ','>
</#if>
<#if (update_url??)>
<#if (update_url_value??)>
${prefixName} `URL` = :update_url_value
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