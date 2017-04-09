<#assign prefixName = 'WHERE'>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName} begin_date = :where_and_eq_beginDate_value
<#else>
${prefixName} begin_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName} created_by_code = :where_and_eq_createdByCode_value
<#else>
${prefixName} created_by_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName} created_date = :where_and_eq_createdDate_value
<#else>
${prefixName} created_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName} data_state_code = :where_and_eq_dataStateCode_value
<#else>
${prefixName} data_state_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName} department_code = :where_and_eq_departmentCode_value
<#else>
${prefixName} department_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName} end_date = :where_and_eq_endDate_value
<#else>
${prefixName} end_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName} flag_code = :where_and_eq_flagCode_value
<#else>
${prefixName} flag_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName} flag_object_code = :where_and_eq_flagObjectCode_value
<#else>
${prefixName} flag_object_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName} json_data = :where_and_eq_jsonData_value
<#else>
${prefixName} json_data IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName} last_modified_by_code = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName} last_modified_by_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName} last_modified_date = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName} last_modified_date IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName} name = :where_and_eq_name_value
<#else>
${prefixName} name IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_order??)>
<#if (where_and_eq_order_value??)>
${prefixName} order_ = :where_and_eq_order_value
<#else>
${prefixName} order_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName} org_code = :where_and_eq_orgCode_value
<#else>
${prefixName} org_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName} parent_code = :where_and_eq_parentCode_value
<#else>
${prefixName} parent_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName} parent_tree_code = :where_and_eq_parentTreeCode_value
<#else>
${prefixName} parent_tree_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName} parent_tree_name = :where_and_eq_parentTreeName_value
<#else>
${prefixName} parent_tree_name IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_permissionCode??)>
<#if (where_and_eq_permissionCode_value??)>
${prefixName} permission_code = :where_and_eq_permissionCode_value
<#else>
${prefixName} permission_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_permissionId??)>
<#if (where_and_eq_permissionId_value??)>
${prefixName} permission_id = :where_and_eq_permissionId_value
<#else>
${prefixName} permission_id IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName} site_code = :where_and_eq_siteCode_value
<#else>
${prefixName} site_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName} state_code = :where_and_eq_stateCode_value
<#else>
${prefixName} state_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName} system_info_code = :where_and_eq_systemInfoCode_value
<#else>
${prefixName} system_info_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName} type_code = :where_and_eq_typeCode_value
<#else>
${prefixName} type_code IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName} version_ = :where_and_eq_version_value
<#else>
${prefixName} version_ IS NULL
</#if>
<#assign prefixName = 'AND'>
</#if>
