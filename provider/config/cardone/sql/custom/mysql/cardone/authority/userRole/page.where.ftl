<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
WHERE 1 = 1
<#if StringUtils.isNotBlank(startTime)>
AND t.`CREATED_DATE` >= :startTime
</#if>
<#if StringUtils.isNotBlank(endTime)>
AND t.`CREATED_DATE` <= :endTime
</#if>
<#if StringUtils.isNotBlank(userName)>
AND (t.`USER_CODE` LIKE CONCAT('%', :userName, "%") OR u.`NAME` LIKE CONCAT('%', :userName, "%"))
</#if>
<#if StringUtils.isNotBlank(roldName)>
AND (t.`ROLE_CODE` LIKE CONCAT('%', :roldName, "%") OR r.`NAME` LIKE CONCAT('%', :roldName, "%"))
</#if>