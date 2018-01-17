UPDATE "c1_user_group_permission"
<#assign prefixName = true>
<#if (update_batchNo??)>
${prefixName?string('SET ', ', ')}"batch_no" = :update_batchNo_value
<#assign prefixName = false>
</#if>
<#if (update_beginDate??)>
${prefixName?string('SET ', ', ')}"begin_date" = :update_beginDate_value
<#assign prefixName = false>
</#if>
<#if (update_createdByCode??)>
${prefixName?string('SET ', ', ')}"created_by_code" = :update_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (update_createdById??)>
${prefixName?string('SET ', ', ')}"created_by_id" = :update_createdById_value
<#assign prefixName = false>
</#if>
<#if (update_createdDate??)>
${prefixName?string('SET ', ', ')}"created_date" = :update_createdDate_value
<#assign prefixName = false>
</#if>
<#if (update_dataStateCode??)>
${prefixName?string('SET ', ', ')}"data_state_code" = :update_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (update_departmentCode??)>
${prefixName?string('SET ', ', ')}"department_code" = :update_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (update_endDate??)>
${prefixName?string('SET ', ', ')}"end_date" = :update_endDate_value
<#assign prefixName = false>
</#if>
<#if (update_flagCode??)>
${prefixName?string('SET ', ', ')}"flag_code" = :update_flagCode_value
<#assign prefixName = false>
</#if>
<#if (update_flagObjectCode??)>
${prefixName?string('SET ', ', ')}"flag_object_code" = :update_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (update_jsonData??)>
${prefixName?string('SET ', ', ')}"json_data" = :update_jsonData_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName?string('SET ', ', ')}"last_modified_by_code" = :update_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedById??)>
${prefixName?string('SET ', ', ')}"last_modified_by_id" = :update_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName?string('SET ', ', ')}"last_modified_date" = :update_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (update_orderBy??)>
${prefixName?string('SET ', ', ')}"order_by_" = :update_orderBy_value
<#assign prefixName = false>
</#if>
<#if (update_orgCode??)>
${prefixName?string('SET ', ', ')}"org_code" = :update_orgCode_value
<#assign prefixName = false>
</#if>
<#if (update_permissionCode??)>
${prefixName?string('SET ', ', ')}"permission_code" = :update_permissionCode_value
<#assign prefixName = false>
</#if>
<#if (update_permissionId??)>
${prefixName?string('SET ', ', ')}"permission_id" = :update_permissionId_value
<#assign prefixName = false>
</#if>
<#if (update_personalCode??)>
${prefixName?string('SET ', ', ')}"personal_code" = :update_personalCode_value
<#assign prefixName = false>
</#if>
<#if (update_personalId??)>
${prefixName?string('SET ', ', ')}"personal_id" = :update_personalId_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('SET ', ', ')}"site_code" = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_stateCode??)>
${prefixName?string('SET ', ', ')}"state_code" = :update_stateCode_value
<#assign prefixName = false>
</#if>
<#if (update_systemInfoCode??)>
${prefixName?string('SET ', ', ')}"system_info_code" = :update_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (update_userGroupCode??)>
${prefixName?string('SET ', ', ')}"user_group_code" = :update_userGroupCode_value
<#assign prefixName = false>
</#if>
<#if (update_userGroupId??)>
${prefixName?string('SET ', ', ')}"user_group_id" = :update_userGroupId_value
<#assign prefixName = false>
</#if>
<#if (update_userGroupPermissionId??)>
${prefixName?string('SET ', ', ')}"user_group_permission_id" = :update_userGroupPermissionId_value
<#assign prefixName = false>
</#if>
<#if (update_version??)>
${prefixName?string('SET ', ', ')}"version_" = :update_version_value
<#assign prefixName = false>
</#if>
<#include "where.ftl">