INSERT
INTO C1_ROLE_PERMISSION
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}BATCH_NO
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}END_DATE
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}JSON_DATA
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}ORG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_permissionCode??) && (insert_permissionCode_value??)>
${prefixName?string('  ', ', ')}PERMISSION_CODE
<#assign prefixName = false>
</#if>
<#if (insert_permissionId??) && (insert_permissionId_value??)>
${prefixName?string('  ', ', ')}PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (insert_roleCode??) && (insert_roleCode_value??)>
${prefixName?string('  ', ', ')}ROLE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_roleId??) && (insert_roleId_value??)>
${prefixName?string('  ', ', ')}ROLE_ID
<#assign prefixName = false>
</#if>
<#if (insert_rolePermissionId??) && (insert_rolePermissionId_value??)>
${prefixName?string('  ', ', ')}ROLE_PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}SITE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}VERSION_
<#assign prefixName = false>
</#if>
)
VALUES
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}:insert_batchNo_value
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}:insert_beginDate_value
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}:insert_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}:insert_createdById_value
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}:insert_createdDate_value
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}:insert_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}:insert_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}:insert_endDate_value
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagCode_value
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}:insert_jsonData_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}:insert_orderBy_value
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}:insert_orgCode_value
<#assign prefixName = false>
</#if>
<#if (insert_permissionCode??) && (insert_permissionCode_value??)>
${prefixName?string('  ', ', ')}:insert_permissionCode_value
<#assign prefixName = false>
</#if>
<#if (insert_permissionId??) && (insert_permissionId_value??)>
${prefixName?string('  ', ', ')}:insert_permissionId_value
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}:insert_personalCode_value
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}:insert_personalId_value
<#assign prefixName = false>
</#if>
<#if (insert_roleCode??) && (insert_roleCode_value??)>
${prefixName?string('  ', ', ')}:insert_roleCode_value
<#assign prefixName = false>
</#if>
<#if (insert_roleId??) && (insert_roleId_value??)>
${prefixName?string('  ', ', ')}:insert_roleId_value
<#assign prefixName = false>
</#if>
<#if (insert_rolePermissionId??) && (insert_rolePermissionId_value??)>
${prefixName?string('  ', ', ')}:insert_rolePermissionId_value
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}:insert_siteCode_value
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}:insert_stateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}:insert_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}:insert_version_value
<#assign prefixName = false>
</#if>
)