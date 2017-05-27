<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(userCode)>
${prefixName?string('WHERE ', 'AND ')}u.user_code = :userCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(userName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:userName in u.user_code) > 0 OR POSITION(:userName in u.name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(permissionCode)>
${prefixName?string('WHERE ', 'AND ')}p.permission_code = :permissionCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(permissionTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:permissionTreeName in p.permission_code) > 0 OR POSITION(:permissionTreeName in p.name) > 0 OR POSITION(:userName in p.parent_tree_code) > 0 OR POSITION(:userName in p.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}((u.begin_date is null OR u.begin_date >= :startTime) OR (u.end_date is null OR u.end_date >= :startTime))
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}((u.begin_date is null OR u.begin_date <= :endTime) OR (u.end_date is null OR u.end_date <= :endTime))
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(flagCode)>
${prefixName?string('WHERE ', 'AND ')}u.flag_code = :flagCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(stateCode)>
${prefixName?string('WHERE ', 'AND ')}u.state_code = :stateCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dataStateCode)>
${prefixName?string('WHERE ', 'AND ')}u.data_state_code = :dataStateCode
    <#assign prefixName = false>
</#if>