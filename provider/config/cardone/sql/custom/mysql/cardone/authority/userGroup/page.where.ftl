WHERE 1 = 1
<#if cardone.StringUtils.isNotBlank(typeCode)>
AND t.`TYPE_CODE` = :typeCode
<#elseif cardone.StringUtils.isNotBlank(typeName)>
AND EXISTS(SELECT s.* FROM `c1_dictionary` s WHERE s.`DICTIONARY_TYPE_CODE` = 'userGroupType' AND LOCATE(:typeName, s.`NAME`))
</#if>
<#if cardone.StringUtils.isNotBlank(parentCode)>
AND (t.`PARENT_CODE` = :parentCode OR LOCATE(:parentCode, t.`PARENT_TREE_CODE`))
<#elseif cardone.StringUtils.isNotBlank(parentTreeName)>
AND (LOCATE(:parentTreeName, t.`PARENT_CODE`) OR LOCATE(:parentTreeName, t.`PARENT_TREE_CODE`) OR LOCATE(:parentTreeName, t.`PARENT_TREE_NAME`))
</#if>
<#if cardone.StringUtils.isNotBlank(userGroupCode)>
AND t.`user_group_CODE` = :userGroupCode
<#elseif cardone.StringUtils.isNotBlank(name)>
AND (LOCATE(:name, t.`user_group_CODE`) OR LOCATE(:name, t.`NAME`))
</#if>
<#if cardone.StringUtils.isNotBlank(startTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` >= :startTime) OR (t.`END_DATE` is null OR t.`END_DATE` >= :startTime))
</#if>
<#if cardone.StringUtils.isNotBlank(endTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` <= CONCAT(:endTime, ' 59:59:59')) OR (t.`END_DATE` is null OR t.`END_DATE` <= CONCAT(:endTime, ' 59:59:59')))
</#if>
<#if cardone.StringUtils.isNotBlank(flagCode)>
AND t.`FLAG_CODE` = :flagCode
</#if>
<#if cardone.StringUtils.isNotBlank(stateCode)>
AND t.`STATE_CODE` = :stateCode
</#if>
<#if cardone.StringUtils.isNotBlank(dataStateCode)>
AND t.`DATA_STATE_CODE` = :dataStateCode
</#if>
