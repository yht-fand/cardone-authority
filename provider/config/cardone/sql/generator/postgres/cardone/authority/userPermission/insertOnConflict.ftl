<#include "insert.ftl">
on conflict (
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')}"batch_no"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')}"begin_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')}"created_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')}"created_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')}"created_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')}"data_state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')}"department_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')}"end_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')}"flag_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')}"flag_object_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')}"json_data"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')}"last_modified_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')}"last_modified_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')}"last_modified_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')}"order_by_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')}"org_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_permissionCode??)>
${prefixName?string('', ', ')}"permission_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_permissionId??)>
${prefixName?string('', ', ')}"permission_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')}"personal_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')}"personal_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}"site_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')}"state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')}"system_info_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_userCode??)>
${prefixName?string('', ', ')}"user_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_userId??)>
${prefixName?string('', ', ')}"user_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_userPermissionId??)>
${prefixName?string('', ', ')}"user_permission_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')}"version_"
</#if>
<#assign prefixName = false>
</#if>
) do nothing