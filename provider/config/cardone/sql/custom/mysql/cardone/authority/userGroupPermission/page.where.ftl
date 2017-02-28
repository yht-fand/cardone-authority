<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
WHERE 1 = 1
<#if StringUtils.isNotBlank(userGroupCode)>
AND t.`USER_GROUP_CODE` = :userGroupCode
<#elseif  StringUtils.isNotBlank(userGroupTreeName)>
AND (LOCATE(:userGroupTreeName, ug.`PARENT_CODE`) OR LOCATE(:userGroupTreeName, ug.`PARENT_TREE_CODE`) OR LOCATE(:userGroupTreeName, ug.`PARENT_TREE_NAME`) OR LOCATE(:userGroupTreeName, t.`USER_GROUP_CODE`) OR LOCATE(:userGroupTreeName, ug.`NAME`))
</#if>
<#if StringUtils.isNotBlank(permissionCode)>
AND t.`PERMISSION_CODE` = :permissionCode
<#elseif  StringUtils.isNotBlank(permissionTreeName)>
AND (LOCATE(:permissionTreeName, p.`PARENT_CODE`) OR LOCATE(:permissionTreeName, p.`PARENT_TREE_CODE`) OR LOCATE(:permissionTreeName, p.`PARENT_TREE_NAME`) OR LOCATE(:permissionTreeName, t.`PERMISSION_CODE`) OR LOCATE(:permissionTreeName, p.`NAME`))
</#if>
<#if StringUtils.isNotBlank(startTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` >= :startTime) OR (t.`END_DATE` is null OR t.`END_DATE` >= :startTime))
</#if>
<#if StringUtils.isNotBlank(endTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` <= CONCAT(:endTime, ' 59:59:59')) OR (t.`END_DATE` is null OR t.`END_DATE` <= CONCAT(:endTime, ' 59:59:59')))
</#if>
<#if StringUtils.isNotBlank(flagCode)>
AND t.`FLAG_CODE` = :flagCode
</#if>
<#if StringUtils.isNotBlank(stateCode)>
AND t.`STATE_CODE` = :stateCode
</#if>
<#if StringUtils.isNotBlank(dataStateCode)>
AND t.`DATA_STATE_CODE` = :dataStateCode
</#if>