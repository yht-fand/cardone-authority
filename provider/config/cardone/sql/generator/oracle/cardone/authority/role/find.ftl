SELECT
<#assign prefixName = true>
<#if (select_batchNo??)>
${prefixName?string('  ', ', ')}BATCH_NO
<#assign prefixName = false>
</#if>
<#if (select_beginDate??)>
${prefixName?string('  ', ', ')}BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (select_createdByCode??)>
${prefixName?string('  ', ', ')}CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (select_createdById??)>
${prefixName?string('  ', ', ')}CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (select_createdDate??)>
${prefixName?string('  ', ', ')}CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (select_dataStateCode??)>
${prefixName?string('  ', ', ')}DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (select_departmentCode??)>
${prefixName?string('  ', ', ')}DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (select_endDate??)>
${prefixName?string('  ', ', ')}END_DATE
<#assign prefixName = false>
</#if>
<#if (select_flagCode??)>
${prefixName?string('  ', ', ')}FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (select_flagObjectCode??)>
${prefixName?string('  ', ', ')}FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (select_jsonData??)>
${prefixName?string('  ', ', ')}JSON_DATA
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedById??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (select_name??)>
${prefixName?string('  ', ', ')}NAME
<#assign prefixName = false>
</#if>
<#if (select_orderBy??)>
${prefixName?string('  ', ', ')}ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (select_orgCode??)>
${prefixName?string('  ', ', ')}ORG_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentCode??)>
${prefixName?string('  ', ', ')}PARENT_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentId??)>
${prefixName?string('  ', ', ')}PARENT_ID
<#assign prefixName = false>
</#if>
<#if (select_parentTreeCode??)>
${prefixName?string('  ', ', ')}PARENT_TREE_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentTreeId??)>
${prefixName?string('  ', ', ')}PARENT_TREE_ID
<#assign prefixName = false>
</#if>
<#if (select_parentTreeName??)>
${prefixName?string('  ', ', ')}PARENT_TREE_NAME
<#assign prefixName = false>
</#if>
<#if (select_personalCode??)>
${prefixName?string('  ', ', ')}PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (select_personalId??)>
${prefixName?string('  ', ', ')}PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (select_roleCode??)>
${prefixName?string('  ', ', ')}ROLE_CODE
<#assign prefixName = false>
</#if>
<#if (select_roleId??)>
${prefixName?string('  ', ', ')}ROLE_ID
<#assign prefixName = false>
</#if>
<#if (select_siteCode??)>
${prefixName?string('  ', ', ')}SITE_CODE
<#assign prefixName = false>
</#if>
<#if (select_stateCode??)>
${prefixName?string('  ', ', ')}STATE_CODE
<#assign prefixName = false>
</#if>
<#if (select_systemInfoCode??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (select_typeCode??)>
${prefixName?string('  ', ', ')}TYPE_CODE
<#assign prefixName = false>
</#if>
<#if (select_version??)>
${prefixName?string('  ', ', ')}VERSION_
<#assign prefixName = false>
</#if>
<#if prefixName>
*
</#if>
FROM C1_ROLE
<#include "where.ftl">
<#assign prefixName = true>
<#if (order_by_batchNo??)>
${prefixName?string('ORDER BY ', ', ')}BATCH_NO ${order_by_batchNo_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_beginDate??)>
${prefixName?string('ORDER BY ', ', ')}BEGIN_DATE ${order_by_beginDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdByCode??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_BY_CODE ${order_by_createdByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdById??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_BY_ID ${order_by_createdById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdDate??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_DATE ${order_by_createdDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName?string('ORDER BY ', ', ')}DATA_STATE_CODE ${order_by_dataStateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_departmentCode??)>
${prefixName?string('ORDER BY ', ', ')}DEPARTMENT_CODE ${order_by_departmentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_endDate??)>
${prefixName?string('ORDER BY ', ', ')}END_DATE ${order_by_endDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagCode??)>
${prefixName?string('ORDER BY ', ', ')}FLAG_CODE ${order_by_flagCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName?string('ORDER BY ', ', ')}FLAG_OBJECT_CODE ${order_by_flagObjectCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_jsonData??)>
${prefixName?string('ORDER BY ', ', ')}JSON_DATA ${order_by_jsonData_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_BY_CODE ${order_by_lastModifiedByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedById??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_BY_ID ${order_by_lastModifiedById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_DATE ${order_by_lastModifiedDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_name??)>
${prefixName?string('ORDER BY ', ', ')}NAME ${order_by_name_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orderBy??)>
${prefixName?string('ORDER BY ', ', ')}ORDER_BY_ ${order_by_orderBy_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orgCode??)>
${prefixName?string('ORDER BY ', ', ')}ORG_CODE ${order_by_orgCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentCode??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_CODE ${order_by_parentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentId??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_ID ${order_by_parentId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_CODE ${order_by_parentTreeCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeId??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_ID ${order_by_parentTreeId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_NAME ${order_by_parentTreeName_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalCode??)>
${prefixName?string('ORDER BY ', ', ')}PERSONAL_CODE ${order_by_personalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalId??)>
${prefixName?string('ORDER BY ', ', ')}PERSONAL_ID ${order_by_personalId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_roleCode??)>
${prefixName?string('ORDER BY ', ', ')}ROLE_CODE ${order_by_roleCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_roleId??)>
${prefixName?string('ORDER BY ', ', ')}ROLE_ID ${order_by_roleId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_siteCode??)>
${prefixName?string('ORDER BY ', ', ')}SITE_CODE ${order_by_siteCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_stateCode??)>
${prefixName?string('ORDER BY ', ', ')}STATE_CODE ${order_by_stateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName?string('ORDER BY ', ', ')}SYSTEM_INFO_CODE ${order_by_systemInfoCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_typeCode??)>
${prefixName?string('ORDER BY ', ', ')}TYPE_CODE ${order_by_typeCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_version??)>
${prefixName?string('ORDER BY ', ', ')}VERSION_ ${order_by_version_value!}
<#assign prefixName = false>
</#if>
