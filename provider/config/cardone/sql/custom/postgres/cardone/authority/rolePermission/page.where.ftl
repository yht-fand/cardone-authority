<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(roleCode)>
${prefixName?string('WHERE ', 'AND ')}ug.role_code = :roleCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(roleTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:roleTreeName in ug.role_code) > 0 OR POSITION(:roleTreeName in ug.name) > 0 OR POSITION(:roleTreeName in ug.parent_tree_code) > 0 OR POSITION(:roleTreeName in ug.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(permissionCode)>
${prefixName?string('WHERE ', 'AND ')}p.permission_code = :permissionCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(permissionTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:permissionTreeName in p.permission_code) > 0 OR POSITION(:permissionTreeName in p.name) > 0 OR POSITION(:roleTreeName in p.parent_tree_code) > 0 OR POSITION(:roleTreeName in p.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}(ug.begin_date >= :startTime OR ug.end_date >= :startTime)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}(ug.begin_date < :endTime OR ug.end_date < :endTime)
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