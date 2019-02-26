MERGE INTO C1_USER_PERMISSION A USING
(SELECT
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')} :index_batchNo_value AS BATCH_NO
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')} :index_beginDate_value AS BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')} :index_createdByCode_value AS CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')} :index_createdById_value AS CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')} :index_createdDate_value AS CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')} :index_dataStateCode_value AS DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')} :index_departmentCode_value AS DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')} :index_endDate_value AS END_DATE
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')} :index_flagCode_value AS FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')} :index_flagObjectCode_value AS FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')} :index_jsonData_value AS JSON_DATA
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')} :index_lastModifiedByCode_value AS LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')} :index_lastModifiedById_value AS LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')} :index_lastModifiedDate_value AS LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')} :index_orderBy_value AS ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')} :index_orgCode_value AS ORG_CODE
<#assign prefixName = false>
</#if>
<#if (index_permissionCode??)>
${prefixName?string('', ', ')} :index_permissionCode_value AS PERMISSION_CODE
<#assign prefixName = false>
</#if>
<#if (index_permissionId??)>
${prefixName?string('', ', ')} :index_permissionId_value AS PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')} :index_personalCode_value AS PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')} :index_personalId_value AS PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')} :index_siteCode_value AS SITE_CODE
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')} :index_stateCode_value AS STATE_CODE
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')} :index_systemInfoCode_value AS SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (index_userCode??)>
${prefixName?string('', ', ')} :index_userCode_value AS USER_CODE
<#assign prefixName = false>
</#if>
<#if (index_userId??)>
${prefixName?string('', ', ')} :index_userId_value AS USER_ID
<#assign prefixName = false>
</#if>
<#if (index_userPermissionId??)>
${prefixName?string('', ', ')} :index_userPermissionId_value AS USER_PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')} :index_version_value AS VERSION_
<#assign prefixName = false>
</#if>
 FROM DUAL) B
ON (
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')}A.BATCH_NO = B.BATCH_NO
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')}A.BEGIN_DATE = B.BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')}A.CREATED_BY_CODE = B.CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')}A.CREATED_BY_ID = B.CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')}A.CREATED_DATE = B.CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')}A.DATA_STATE_CODE = B.DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')}A.DEPARTMENT_CODE = B.DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')}A.END_DATE = B.END_DATE
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')}A.FLAG_CODE = B.FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')}A.FLAG_OBJECT_CODE = B.FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')}A.JSON_DATA = B.JSON_DATA
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_BY_CODE = B.LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_BY_ID = B.LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_DATE = B.LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')}A.ORDER_BY_ = B.ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')}A.ORG_CODE = B.ORG_CODE
<#assign prefixName = false>
</#if>
<#if (index_permissionCode??)>
${prefixName?string('', ', ')}A.PERMISSION_CODE = B.PERMISSION_CODE
<#assign prefixName = false>
</#if>
<#if (index_permissionId??)>
${prefixName?string('', ', ')}A.PERMISSION_ID = B.PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')}A.PERSONAL_CODE = B.PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')}A.PERSONAL_ID = B.PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}A.SITE_CODE = B.SITE_CODE
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')}A.STATE_CODE = B.STATE_CODE
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')}A.SYSTEM_INFO_CODE = B.SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (index_userCode??)>
${prefixName?string('', ', ')}A.USER_CODE = B.USER_CODE
<#assign prefixName = false>
</#if>
<#if (index_userId??)>
${prefixName?string('', ', ')}A.USER_ID = B.USER_ID
<#assign prefixName = false>
</#if>
<#if (index_userPermissionId??)>
${prefixName?string('', ', ')}A.USER_PERMISSION_ID = B.USER_PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')}A.VERSION_ = B.VERSION_
<#assign prefixName = false>
</#if>
)
WHEN MATCHED THEN
UPDATE SET
<#assign prefixName = true>
<#if (update_batchNo??)>
${prefixName?string('', ', ')}A.BATCH_NO = :update_batchNo_value
<#assign prefixName = false>
</#if>
<#if (update_beginDate??)>
${prefixName?string('', ', ')}A.BEGIN_DATE = :update_beginDate_value
<#assign prefixName = false>
</#if>
<#if (update_createdByCode??)>
${prefixName?string('', ', ')}A.CREATED_BY_CODE = :update_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (update_createdById??)>
${prefixName?string('', ', ')}A.CREATED_BY_ID = :update_createdById_value
<#assign prefixName = false>
</#if>
<#if (update_createdDate??)>
${prefixName?string('', ', ')}A.CREATED_DATE = :update_createdDate_value
<#assign prefixName = false>
</#if>
<#if (update_dataStateCode??)>
${prefixName?string('', ', ')}A.DATA_STATE_CODE = :update_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (update_departmentCode??)>
${prefixName?string('', ', ')}A.DEPARTMENT_CODE = :update_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (update_endDate??)>
${prefixName?string('', ', ')}A.END_DATE = :update_endDate_value
<#assign prefixName = false>
</#if>
<#if (update_flagCode??)>
${prefixName?string('', ', ')}A.FLAG_CODE = :update_flagCode_value
<#assign prefixName = false>
</#if>
<#if (update_flagObjectCode??)>
${prefixName?string('', ', ')}A.FLAG_OBJECT_CODE = :update_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (update_jsonData??)>
${prefixName?string('', ', ')}A.JSON_DATA = :update_jsonData_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_BY_CODE = :update_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedById??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_BY_ID = :update_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName?string('', ', ')}A.LAST_MODIFIED_DATE = :update_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (update_orderBy??)>
${prefixName?string('', ', ')}A.ORDER_BY_ = :update_orderBy_value
<#assign prefixName = false>
</#if>
<#if (update_orgCode??)>
${prefixName?string('', ', ')}A.ORG_CODE = :update_orgCode_value
<#assign prefixName = false>
</#if>
<#if (update_permissionCode??)>
${prefixName?string('', ', ')}A.PERMISSION_CODE = :update_permissionCode_value
<#assign prefixName = false>
</#if>
<#if (update_permissionId??)>
${prefixName?string('', ', ')}A.PERMISSION_ID = :update_permissionId_value
<#assign prefixName = false>
</#if>
<#if (update_personalCode??)>
${prefixName?string('', ', ')}A.PERSONAL_CODE = :update_personalCode_value
<#assign prefixName = false>
</#if>
<#if (update_personalId??)>
${prefixName?string('', ', ')}A.PERSONAL_ID = :update_personalId_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('', ', ')}A.SITE_CODE = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_stateCode??)>
${prefixName?string('', ', ')}A.STATE_CODE = :update_stateCode_value
<#assign prefixName = false>
</#if>
<#if (update_systemInfoCode??)>
${prefixName?string('', ', ')}A.SYSTEM_INFO_CODE = :update_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (update_userCode??)>
${prefixName?string('', ', ')}A.USER_CODE = :update_userCode_value
<#assign prefixName = false>
</#if>
<#if (update_userId??)>
${prefixName?string('', ', ')}A.USER_ID = :update_userId_value
<#assign prefixName = false>
</#if>
<#if (update_userPermissionId??)>
${prefixName?string('', ', ')}A.USER_PERMISSION_ID = :update_userPermissionId_value
<#assign prefixName = false>
</#if>
<#if (update_version??)>
${prefixName?string('', ', ')}A.VERSION_ = :update_version_value
<#assign prefixName = false>
</#if>
WHEN NOT MATCHED THEN
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}A.BATCH_NO
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}A.BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}A.CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}A.CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}A.CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}A.DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}A.DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}A.END_DATE
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}A.FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}A.FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}A.JSON_DATA
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}A.LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}A.LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}A.LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}A.ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}A.ORG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_permissionCode??) && (insert_permissionCode_value??)>
${prefixName?string('  ', ', ')}A.PERMISSION_CODE
<#assign prefixName = false>
</#if>
<#if (insert_permissionId??) && (insert_permissionId_value??)>
${prefixName?string('  ', ', ')}A.PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}A.PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}A.PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}A.SITE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}A.STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}A.SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (insert_userCode??) && (insert_userCode_value??)>
${prefixName?string('  ', ', ')}A.USER_CODE
<#assign prefixName = false>
</#if>
<#if (insert_userId??) && (insert_userId_value??)>
${prefixName?string('  ', ', ')}A.USER_ID
<#assign prefixName = false>
</#if>
<#if (insert_userPermissionId??) && (insert_userPermissionId_value??)>
${prefixName?string('  ', ', ')}A.USER_PERMISSION_ID
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}A.VERSION_
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
<#if (insert_userCode??) && (insert_userCode_value??)>
${prefixName?string('  ', ', ')}:insert_userCode_value
<#assign prefixName = false>
</#if>
<#if (insert_userId??) && (insert_userId_value??)>
${prefixName?string('  ', ', ')}:insert_userId_value
<#assign prefixName = false>
</#if>
<#if (insert_userPermissionId??) && (insert_userPermissionId_value??)>
${prefixName?string('  ', ', ')}:insert_userPermissionId_value
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}:insert_version_value
<#assign prefixName = false>
</#if>
)

