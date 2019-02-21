UPDATE C1_USER_GROUP
<#assign prefixName = true>
<#if (update_batchNo??)>
${prefixName?string('SET ', ', ')}BATCH_NO = :update_batchNo_value
<#assign prefixName = false>
</#if>
<#if (update_beginDate??)>
${prefixName?string('SET ', ', ')}BEGIN_DATE = :update_beginDate_value
<#assign prefixName = false>
</#if>
<#if (update_createdByCode??)>
${prefixName?string('SET ', ', ')}CREATED_BY_CODE = :update_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (update_createdById??)>
${prefixName?string('SET ', ', ')}CREATED_BY_ID = :update_createdById_value
<#assign prefixName = false>
</#if>
<#if (update_createdDate??)>
${prefixName?string('SET ', ', ')}CREATED_DATE = :update_createdDate_value
<#assign prefixName = false>
</#if>
<#if (update_dataStateCode??)>
${prefixName?string('SET ', ', ')}DATA_STATE_CODE = :update_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (update_departmentCode??)>
${prefixName?string('SET ', ', ')}DEPARTMENT_CODE = :update_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (update_endDate??)>
${prefixName?string('SET ', ', ')}END_DATE = :update_endDate_value
<#assign prefixName = false>
</#if>
<#if (update_flagCode??)>
${prefixName?string('SET ', ', ')}FLAG_CODE = :update_flagCode_value
<#assign prefixName = false>
</#if>
<#if (update_flagObjectCode??)>
${prefixName?string('SET ', ', ')}FLAG_OBJECT_CODE = :update_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (update_jsonData??)>
${prefixName?string('SET ', ', ')}JSON_DATA = :update_jsonData_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName?string('SET ', ', ')}LAST_MODIFIED_BY_CODE = :update_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedById??)>
${prefixName?string('SET ', ', ')}LAST_MODIFIED_BY_ID = :update_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName?string('SET ', ', ')}LAST_MODIFIED_DATE = :update_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (update_name??)>
${prefixName?string('SET ', ', ')}NAME = :update_name_value
<#assign prefixName = false>
</#if>
<#if (update_orderBy??)>
${prefixName?string('SET ', ', ')}ORDER_BY_ = :update_orderBy_value
<#assign prefixName = false>
</#if>
<#if (update_orgCode??)>
${prefixName?string('SET ', ', ')}ORG_CODE = :update_orgCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentCode??)>
${prefixName?string('SET ', ', ')}PARENT_CODE = :update_parentCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentId??)>
${prefixName?string('SET ', ', ')}PARENT_ID = :update_parentId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeCode??)>
${prefixName?string('SET ', ', ')}PARENT_TREE_CODE = :update_parentTreeCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeId??)>
${prefixName?string('SET ', ', ')}PARENT_TREE_ID = :update_parentTreeId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeName??)>
${prefixName?string('SET ', ', ')}PARENT_TREE_NAME = :update_parentTreeName_value
<#assign prefixName = false>
</#if>
<#if (update_personalCode??)>
${prefixName?string('SET ', ', ')}PERSONAL_CODE = :update_personalCode_value
<#assign prefixName = false>
</#if>
<#if (update_personalId??)>
${prefixName?string('SET ', ', ')}PERSONAL_ID = :update_personalId_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('SET ', ', ')}SITE_CODE = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_stateCode??)>
${prefixName?string('SET ', ', ')}STATE_CODE = :update_stateCode_value
<#assign prefixName = false>
</#if>
<#if (update_systemInfoCode??)>
${prefixName?string('SET ', ', ')}SYSTEM_INFO_CODE = :update_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (update_typeCode??)>
${prefixName?string('SET ', ', ')}TYPE_CODE = :update_typeCode_value
<#assign prefixName = false>
</#if>
<#if (update_userGroupCode??)>
${prefixName?string('SET ', ', ')}USER_GROUP_CODE = :update_userGroupCode_value
<#assign prefixName = false>
</#if>
<#if (update_userGroupId??)>
${prefixName?string('SET ', ', ')}USER_GROUP_ID = :update_userGroupId_value
<#assign prefixName = false>
</#if>
<#if (update_version??)>
${prefixName?string('SET ', ', ')}VERSION_ = :update_version_value
<#assign prefixName = false>
</#if>
<#include "where.ftl">