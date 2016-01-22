INSERT
INTO
t_oauth_consumer
(<#assign prefixName = ' '>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_clientId??) && (insert_clientId_value??)>
${prefixName} `CLIENT_ID`
<#assign prefixName = ','>
</#if>
<#if (insert_clientSecret??) && (insert_clientSecret_value??)>
${prefixName} `CLIENT_SECRET`
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (insert_oauthConsumerId??) && (insert_oauthConsumerId_value??)>
${prefixName} `OAUTH_CONSUMER_ID`
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_permissionCodes??) && (insert_permissionCodes_value??)>
${prefixName} `PERMISSION_CODES`
<#assign prefixName = ','>
</#if>
<#if (insert_roleCodes??) && (insert_roleCodes_value??)>
${prefixName} `ROLE_CODES`
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} `SITE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE`
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if (insert_wfId??) && (insert_wfId_value??)>
${prefixName} `WF_ID`
<#assign prefixName = ','>
</#if>
)
(SELECT
<#assign prefixName = ' '>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} :insert_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_clientId??) && (insert_clientId_value??)>
${prefixName} :insert_clientId_value
<#assign prefixName = ','>
</#if>
<#if (insert_clientSecret??) && (insert_clientSecret_value??)>
${prefixName} :insert_clientSecret_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} :insert_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} :insert_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} :insert_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} :insert_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} :insert_endDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} :insert_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} :insert_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (insert_oauthConsumerId??) && (insert_oauthConsumerId_value??)>
${prefixName} :insert_oauthConsumerId_value
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} :insert_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_permissionCodes??) && (insert_permissionCodes_value??)>
${prefixName} :insert_permissionCodes_value
<#assign prefixName = ','>
</#if>
<#if (insert_roleCodes??) && (insert_roleCodes_value??)>
${prefixName} :insert_roleCodes_value
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} :insert_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} :insert_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} :insert_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} :insert_version_value
<#assign prefixName = ','>
</#if>
<#if (insert_wfId??) && (insert_wfId_value??)>
${prefixName} :insert_wfId_value
<#assign prefixName = ','>
</#if>
FROM DUAL WHERE NOT EXISTS (SELECT 1 FROM t_oauth_consumer E
<#assign prefixName = 'WHERE'>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} E.BEGIN_DATE = :where_and_eq_beginDate_value
<#else>
${prefixName} E.BEGIN_DATE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_clientId??)>
<#if (where_and_eq_clientId_value??)>
${prefixName} E.CLIENT_ID = :where_and_eq_clientId_value
<#else>
${prefixName} E.CLIENT_ID IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_clientSecret??)>
<#if (where_and_eq_clientSecret_value??)>
${prefixName} E.CLIENT_SECRET = :where_and_eq_clientSecret_value
<#else>
${prefixName} E.CLIENT_SECRET IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} E.CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName} E.CREATED_BY_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} E.CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName} E.CREATED_DATE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} E.DATA_STATE_CODE = :where_and_eq_dataStateCode_value
<#else>
${prefixName} E.DATA_STATE_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} E.DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName} E.DEPARTMENT_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} E.END_DATE = :where_and_eq_endDate_value
<#else>
${prefixName} E.END_DATE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} E.LAST_MODIFIED_BY_CODE = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} E.LAST_MODIFIED_BY_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} E.LAST_MODIFIED_DATE = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} E.LAST_MODIFIED_DATE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_oauthConsumerId??)>
<#if (where_and_eq_oauthConsumerId_value??)>
${prefixName} E.OAUTH_CONSUMER_ID = :where_and_eq_oauthConsumerId_value
<#else>
${prefixName} E.OAUTH_CONSUMER_ID IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} E.ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName} E.ORG_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_permissionCodes??)>
<#if (where_and_eq_permissionCodes_value??)>
${prefixName} E.PERMISSION_CODES = :where_and_eq_permissionCodes_value
<#else>
${prefixName} E.PERMISSION_CODES IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_roleCodes??)>
<#if (where_and_eq_roleCodes_value??)>
${prefixName} E.ROLE_CODES = :where_and_eq_roleCodes_value
<#else>
${prefixName} E.ROLE_CODES IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} E.SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName} E.SITE_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} E.STATE_CODE = :where_and_eq_stateCode_value
<#else>
${prefixName} E.STATE_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} E.SYSTEM_INFO_CODE = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} E.SYSTEM_INFO_CODE IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} E.VERSION_ = :where_and_eq_version_value
<#else>
${prefixName} E.VERSION_ IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_wfId??)>
<#if (where_and_eq_wfId_value??)>
${prefixName} E.WF_ID = :where_and_eq_wfId_value
<#else>
${prefixName} E.WF_ID IS NULL
</#if>
<#assign prefixName = ''>
</#if>
))