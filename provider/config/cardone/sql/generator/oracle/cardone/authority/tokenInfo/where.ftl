<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}BATCH_NO = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(BATCH_NO IS NULL OR BATCH_NO = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}BEGIN_DATE = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}BEGIN_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_clientId??)>
<#if (where_and_eq_clientId_value??)>
${prefixName?string('WHERE ', 'AND ')}CLIENT_ID = :where_and_eq_clientId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CLIENT_ID IS NULL OR CLIENT_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CREATED_BY_CODE IS NULL OR CREATED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_BY_ID = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CREATED_BY_ID IS NULL OR CREATED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}CREATED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}DATA_STATE_CODE = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(DATA_STATE_CODE IS NULL OR DATA_STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(DEPARTMENT_CODE IS NULL OR DEPARTMENT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}END_DATE = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}END_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}FLAG_CODE = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FLAG_CODE IS NULL OR FLAG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}FLAG_OBJECT_CODE = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FLAG_OBJECT_CODE IS NULL OR FLAG_OBJECT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}JSON_DATA = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}JSON_DATA IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_BY_CODE = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LAST_MODIFIED_BY_CODE IS NULL OR LAST_MODIFIED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_BY_ID = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LAST_MODIFIED_BY_ID IS NULL OR LAST_MODIFIED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_DATE = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}ORDER_BY_ = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}ORDER_BY_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(ORG_CODE IS NULL OR ORG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}PERSONAL_CODE = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PERSONAL_CODE IS NULL OR PERSONAL_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}PERSONAL_ID = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PERSONAL_ID IS NULL OR PERSONAL_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_scope??)>
<#if (where_and_eq_scope_value??)>
${prefixName?string('WHERE ', 'AND ')}SCOPE = :where_and_eq_scope_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SCOPE IS NULL OR SCOPE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SITE_CODE IS NULL OR SITE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}STATE_CODE = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(STATE_CODE IS NULL OR STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}SYSTEM_INFO_CODE = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SYSTEM_INFO_CODE IS NULL OR SYSTEM_INFO_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_tokenInfoCode??)>
<#if (where_and_eq_tokenInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}TOKEN_INFO_CODE = :where_and_eq_tokenInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(TOKEN_INFO_CODE IS NULL OR TOKEN_INFO_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_tokenInfoId??)>
<#if (where_and_eq_tokenInfoId_value??)>
${prefixName?string('WHERE ', 'AND ')}TOKEN_INFO_ID = :where_and_eq_tokenInfoId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(TOKEN_INFO_ID IS NULL OR TOKEN_INFO_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_userCode??)>
<#if (where_and_eq_userCode_value??)>
${prefixName?string('WHERE ', 'AND ')}USER_CODE = :where_and_eq_userCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(USER_CODE IS NULL OR USER_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_userId??)>
<#if (where_and_eq_userId_value??)>
${prefixName?string('WHERE ', 'AND ')}USER_ID = :where_and_eq_userId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(USER_ID IS NULL OR USER_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}VERSION_ = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}VERSION_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
