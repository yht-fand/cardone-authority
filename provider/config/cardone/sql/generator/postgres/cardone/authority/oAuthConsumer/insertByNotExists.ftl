INSERT
INTO
c1_oauth_consumer
(<#assign prefixName = ' '>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName} batch_no
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} begin_date
<#assign prefixName = ','>
</#if>
<#if (insert_clientSecret??) && (insert_clientSecret_value??)>
${prefixName} client_secret
<#assign prefixName = ','>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName} created_by_code
<#assign prefixName = ','>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName} created_date
<#assign prefixName = ','>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName} data_state_code
<#assign prefixName = ','>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName} department_code
<#assign prefixName = ','>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName} end_date
<#assign prefixName = ','>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} flag_code
<#assign prefixName = ','>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName} flag_object_code
<#assign prefixName = ','>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName} json_data
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName} last_modified_by_code
<#assign prefixName = ','>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName} last_modified_date
<#assign prefixName = ','>
</#if>
<#if (insert_oauthConsumerId??) && (insert_oauthConsumerId_value??)>
${prefixName} oauth_consumer_id
<#assign prefixName = ','>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName} order_by_
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} org_code
<#assign prefixName = ','>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName} personal_code
<#assign prefixName = ','>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName} site_code
<#assign prefixName = ','>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName} state_code
<#assign prefixName = ','>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName} system_info_code
<#assign prefixName = ','>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName} version_
<#assign prefixName = ','>
</#if>
)
(SELECT
<#assign prefixName = ' '>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName} :insert_batchNo_value
<#assign prefixName = ','>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName} :insert_beginDate_value
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
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName} :insert_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName} :insert_flagObjectCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName} :insert_jsonData_value
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
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName} :insert_orderBy_value
<#assign prefixName = ','>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName} :insert_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName} :insert_personalCode_value
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
WHERE NOT EXISTS (SELECT 1 FROM c1_oauth_consumer E
<#assign prefixName = 'WHERE'>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName} E.batch_no = :where_and_eq_batchNo_value
<#else>
${prefixName} E.batch_no IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} E.begin_date = :where_and_eq_beginDate_value
<#else>
${prefixName} E.begin_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_clientSecret??)>
<#if (where_and_eq_clientSecret_value??)>
${prefixName} E.client_secret = :where_and_eq_clientSecret_value
<#else>
${prefixName} E.client_secret IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} E.created_by_code = :where_and_eq_createdByCode_value
<#else>
${prefixName} E.created_by_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} E.created_date = :where_and_eq_createdDate_value
<#else>
${prefixName} E.created_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} E.data_state_code = :where_and_eq_dataStateCode_value
<#else>
${prefixName} E.data_state_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} E.department_code = :where_and_eq_departmentCode_value
<#else>
${prefixName} E.department_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} E.end_date = :where_and_eq_endDate_value
<#else>
${prefixName} E.end_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName} E.flag_code = :where_and_eq_flagCode_value
<#else>
${prefixName} E.flag_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName} E.flag_object_code = :where_and_eq_flagObjectCode_value
<#else>
${prefixName} E.flag_object_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName} E.json_data = :where_and_eq_jsonData_value
<#else>
${prefixName} E.json_data IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} E.last_modified_by_code = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} E.last_modified_by_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} E.last_modified_date = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} E.last_modified_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_oauthConsumerId??)>
<#if (where_and_eq_oauthConsumerId_value??)>
${prefixName} E.oauth_consumer_id = :where_and_eq_oauthConsumerId_value
<#else>
${prefixName} E.oauth_consumer_id IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName} E.order_by_ = :where_and_eq_orderBy_value
<#else>
${prefixName} E.order_by_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} E.org_code = :where_and_eq_orgCode_value
<#else>
${prefixName} E.org_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName} E.personal_code = :where_and_eq_personalCode_value
<#else>
${prefixName} E.personal_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} E.site_code = :where_and_eq_siteCode_value
<#else>
${prefixName} E.site_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} E.state_code = :where_and_eq_stateCode_value
<#else>
${prefixName} E.state_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} E.system_info_code = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} E.system_info_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} E.version_ = :where_and_eq_version_value
<#else>
${prefixName} E.version_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
))