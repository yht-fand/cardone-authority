<#assign prefixName = 'WHERE'>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} `BEGIN_DATE` = :where_and_eq_beginDate_value
<#else>
${prefixName} `BEGIN_DATE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :where_and_eq_createdByCode_value
<#else>
${prefixName} `CREATED_BY_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} `CREATED_DATE` = :where_and_eq_createdDate_value
<#else>
${prefixName} `CREATED_DATE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} `DATA_STATE_CODE` = :where_and_eq_dataStateCode_value
<#else>
${prefixName} `DATA_STATE_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :where_and_eq_departmentCode_value
<#else>
${prefixName} `DEPARTMENT_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} `END_DATE` = :where_and_eq_endDate_value
<#else>
${prefixName} `END_DATE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} `LAST_MODIFIED_BY_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} `LAST_MODIFIED_DATE` = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} `LAST_MODIFIED_DATE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName} `NAME` = :where_and_eq_name_value
<#else>
${prefixName} `NAME` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_order??)>
<#if (where_and_eq_order_value??)>
${prefixName} `ORDER_` = :where_and_eq_order_value
<#else>
${prefixName} `ORDER_` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} `ORG_CODE` = :where_and_eq_orgCode_value
<#else>
${prefixName} `ORG_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName} `PARENT_CODE` = :where_and_eq_parentCode_value
<#else>
${prefixName} `PARENT_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName} `PARENT_TREE_CODE` = :where_and_eq_parentTreeCode_value
<#else>
${prefixName} `PARENT_TREE_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName} `PARENT_TREE_NAME` = :where_and_eq_parentTreeName_value
<#else>
${prefixName} `PARENT_TREE_NAME` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_permissionCodes??)>
<#if (where_and_eq_permissionCodes_value??)>
${prefixName} `PERMISSION_CODES` = :where_and_eq_permissionCodes_value
<#else>
${prefixName} `PERMISSION_CODES` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_roleCodes??)>
<#if (where_and_eq_roleCodes_value??)>
${prefixName} `ROLE_CODES` = :where_and_eq_roleCodes_value
<#else>
${prefixName} `ROLE_CODES` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} `SITE_CODE` = :where_and_eq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} `SITE_CODE` = :where_and_eq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_and_nq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_and_like_siteCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_siteCode_value??)>
${prefixName} `SITE_CODE` = :where_or_eq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_siteCode_value??)>
${prefixName} `SITE_CODE` <> :where_or_nq_siteCode_value
<#else>
${prefixName} `SITE_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_siteCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_siteCode_value??)>
${prefixName} `SITE_CODE` like :where_or_like_siteCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} `STATE_CODE` = :where_and_eq_stateCode_value
<#else>
${prefixName} `STATE_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_nq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_nq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_and_nq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_and_like_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_like_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_and_like_systemInfoCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_eq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_eq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :where_or_eq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_nq_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_nq_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` <> :where_or_nq_systemInfoCode_value
<#else>
${prefixName} `SYSTEM_INFO_CODE` IS NOT NULL
</#if>
<#assign prefixName = ''>
</#if>
<#if (where_or_like_systemInfoCode??)>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'OR'>
</#if>
<#if (where_or_like_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` like :where_or_like_systemInfoCode_value
</#if>
<#assign prefixName = ''>
</#if>
<#if (prefixName!) != 'WHERE'>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_userGroupCode??)>
<#if (where_and_eq_userGroupCode_value??)>
${prefixName} `USER_GROUP_CODE` = :where_and_eq_userGroupCode_value
<#else>
${prefixName} `USER_GROUP_CODE` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_userGroupId??)>
<#if (where_and_eq_userGroupId_value??)>
${prefixName} `USER_GROUP_ID` = :where_and_eq_userGroupId_value
<#else>
${prefixName} `USER_GROUP_ID` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} `VERSION_` = :where_and_eq_version_value
<#else>
${prefixName} `VERSION_` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_wfId??)>
<#if (where_and_eq_wfId_value??)>
${prefixName} `WF_ID` = :where_and_eq_wfId_value
<#else>
${prefixName} `WF_ID` IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
