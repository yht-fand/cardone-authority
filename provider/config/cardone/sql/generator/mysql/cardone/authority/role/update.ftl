UPDATE c1_role
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
<#if (update_flagCode??)>
${prefixName} `FLAG_CODE` = :update_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (update_flagObjectCode??)>
${prefixName} `FLAG_OBJECT_CODE` = :update_flagObjectCode_value
<#assign prefixName = ','>
</#if>
<#if (update_jsonData??)>
${prefixName} `JSON_DATA` = :update_jsonData_value
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
<#if (update_roleCode??)>
${prefixName} `ROLE_CODE` = :update_roleCode_value
<#assign prefixName = ','>
</#if>
<#if (update_roleId??)>
${prefixName} `ROLE_ID` = :update_roleId_value
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
<#if (update_typeCode??)>
${prefixName} `TYPE_CODE` = :update_typeCode_value
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