<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(userGroupCode)>
${prefixName?string('WHERE ', 'AND ')}ug.user_group_code = :userGroupCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(userGroupTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:userGroupTreeName in ug.user_group_code) > 0 OR POSITION(:userGroupTreeName in ug.name) > 0 OR POSITION(:userGroupTreeName in ug.parent_tree_code) > 0 OR POSITION(:userGroupTreeName in ug.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(permissionCode)>
${prefixName?string('WHERE ', 'AND ')}p.permission_code = :permissionCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(permissionTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:permissionTreeName in p.permission_code) > 0 OR POSITION(:permissionTreeName in p.name) > 0 OR POSITION(:userGroupTreeName in p.parent_tree_code) > 0 OR POSITION(:userGroupTreeName in p.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}ug.begin_date >= :startTime
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}ug.begin_date < :endTime
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(flagCode)>
${prefixName?string('WHERE ', 'AND ')}ug.flag_code = :flagCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(stateCode)>
${prefixName?string('WHERE ', 'AND ')}ug.state_code = :stateCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dataStateCode)>
${prefixName?string('WHERE ', 'AND ')}ug.data_state_code = :dataStateCode
    <#assign prefixName = false>
</#if>