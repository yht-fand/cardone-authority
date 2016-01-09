SELECT
<#assign prefixName = ' '>
<#if (select_beginDate??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_dataOption??)>
${prefixName} `DATA_OPTION`
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_iconStyle??)>
${prefixName} `ICON_STYLE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_name??)>
${prefixName} `NAME`
<#assign prefixName = ','>
</#if>
<#if (select_navigationCode??)>
${prefixName} `NAVIGATION_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_navigationId??)>
${prefixName} `NAVIGATION_ID`
<#assign prefixName = ','>
</#if>
<#if (select_order??)>
${prefixName} `ORDER_`
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentCode??)>
${prefixName} `PARENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeCode??)>
${prefixName} `PARENT_TREE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeName??)>
${prefixName} `PARENT_TREE_NAME`
<#assign prefixName = ','>
</#if>
<#if (select_permissionCodes??)>
${prefixName} `PERMISSION_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_roleCodes??)>
${prefixName} `ROLE_CODES`
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_target??)>
${prefixName} `TARGET`
<#assign prefixName = ','>
</#if>
<#if (select_typeCode??)>
${prefixName} `TYPE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_url??)>
${prefixName} `URL`
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if (select_wfId??)>
${prefixName} `WF_ID`
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
  `BEGIN_DATE`
, `CREATED_BY_CODE`
, `CREATED_DATE`
, `DATA_OPTION`
, `DATA_STATE_CODE`
, `DEPARTMENT_CODE`
, `END_DATE`
, `ICON_STYLE`
, `LAST_MODIFIED_BY_CODE`
, `LAST_MODIFIED_DATE`
, `NAME`
, `NAVIGATION_CODE`
, `NAVIGATION_ID`
, `ORDER_`
, `ORG_CODE`
, `PARENT_CODE`
, `PARENT_TREE_CODE`
, `PARENT_TREE_NAME`
, `PERMISSION_CODES`
, `ROLE_CODES`
, `STATE_CODE`
, `TARGET`
, `TYPE_CODE`
, `URL`
, `VERSION_`
, `WF_ID`
</#if>
FROM t_navigation
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_beginDate??)>
${prefixName} `BEGIN_DATE` ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} `CREATED_BY_CODE` ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} `CREATED_DATE` ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataOption??)>
${prefixName} `DATA_OPTION` ${order_by_dataOption_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} `END_DATE` ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_iconStyle??)>
${prefixName} `ICON_STYLE` ${order_by_iconStyle_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_name??)>
${prefixName} `NAME` ${order_by_name_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationCode??)>
${prefixName} `NAVIGATION_CODE` ${order_by_navigationCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationId??)>
${prefixName} `NAVIGATION_ID` ${order_by_navigationId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_order??)>
${prefixName} `ORDER_` ${order_by_order_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} `ORG_CODE` ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentCode??)>
${prefixName} `PARENT_CODE` ${order_by_parentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName} `PARENT_TREE_CODE` ${order_by_parentTreeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName} `PARENT_TREE_NAME` ${order_by_parentTreeName_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_permissionCodes??)>
${prefixName} `PERMISSION_CODES` ${order_by_permissionCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_roleCodes??)>
${prefixName} `ROLE_CODES` ${order_by_roleCodes_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} `STATE_CODE` ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_target??)>
${prefixName} `TARGET` ${order_by_target_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_typeCode??)>
${prefixName} `TYPE_CODE` ${order_by_typeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_url??)>
${prefixName} `URL` ${order_by_url_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} `VERSION_` ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_wfId??)>
${prefixName} `WF_ID` ${order_by_wfId_value!}
<#assign prefixName = ','>
</#if>
limit <#if offset??>:offset<#else>0</#if> , <#if pageSize??>:pageSize<#else>10</#if>