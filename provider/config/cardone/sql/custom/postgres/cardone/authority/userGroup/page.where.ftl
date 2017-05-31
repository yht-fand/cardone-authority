<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(typeCode)>
${prefixName?string('WHERE ', 'AND ')}t.type_code = :typeCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(typeName)>
${prefixName?string('WHERE ', 'AND ')} EXISTS(SELECT s.* FROM c1_dictionary s WHERE s.DICTIONARY_TYPE_CODE = 'user_groupType' AND LOCATE(:typeName, s.name))
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(parentCode)>
${prefixName?string('WHERE ', 'AND ')}:parentCode = ANY(string_to_array(t.parent_tree_code, ','))
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(parentTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:parentTreeName in t.PARENT_code) > 0 OR POSITION(:parentTreeName in t.parent_tree_code) > 0 OR POSITION(:parentTreeName in t.parent_tree_name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(userGroupCode)>
${prefixName?string('WHERE ', 'AND ')}t.user_group_code = :userGroupCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(name)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:name in t.user_group_code) > 0 OR POSITION(:name in t.name) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}((t.begin_date is null OR t.begin_date >= :startTime) OR (t.end_date is null OR t.end_date >= :startTime))
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}((t.begin_date is null OR t.begin_date < :endTime) OR (t.end_date is null OR t.end_date < :endTime))
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(flagCode)>
${prefixName?string('WHERE ', 'AND ')}t.flag_code = :flagCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(stateCode)>
${prefixName?string('WHERE ', 'AND ')}t.state_code = :stateCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dataStateCode)>
${prefixName?string('WHERE ', 'AND ')}t.data_state_code = :dataStateCode
    <#assign prefixName = false>
</#if>