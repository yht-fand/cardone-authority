package top.cardone.authority.func.navigation.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.NavigationDto;
import top.cardone.authority.service.NavigationService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 导航 - 查询分页
 */
@Component("/web-api/v1/configuration/navigation/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<NavigationDto> navigationDtoPage = ApplicationContextHolder.getBean(NavigationService.class).page(NavigationDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(navigationDtoPage.getContent()), map, navigationDtoPage.getTotalElements());
    }

    private List<Map<String, Object>> toMapList(List<NavigationDto> navigationDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (NavigationDto navigationDto : navigationDtoList) {
            mapList.add(this.toMap(navigationDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(NavigationDto navigationDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", navigationDto.getBeginDate());
        map.put("createdByCode", navigationDto.getCreatedByCode());
        map.put("createdDate", navigationDto.getCreatedDate());
        map.put("dataOption", navigationDto.getDataOption());
        map.put("dataStateCode", navigationDto.getDataStateCode());
        map.put("departmentCode", navigationDto.getDepartmentCode());
        map.put("endDate", navigationDto.getEndDate());
        map.put("iconStyle", navigationDto.getIconStyle());
        map.put("lastModifiedByCode", navigationDto.getLastModifiedByCode());
        map.put("lastModifiedDate", navigationDto.getLastModifiedDate());
        map.put("name", navigationDto.getName());
        map.put("navigationCode", navigationDto.getNavigationCode());
        map.put("navigationId", navigationDto.getNavigationId());
        map.put("order", navigationDto.getOrder());
        map.put("orgCode", navigationDto.getOrgCode());
        map.put("parentCode", navigationDto.getParentCode());
        map.put("parentTreeCode", navigationDto.getParentTreeCode());
        map.put("parentTreeName", navigationDto.getParentTreeName());
        map.put("permissionCodes", navigationDto.getPermissionCodes());
        map.put("roleCodes", navigationDto.getRoleCodes());
        map.put("siteCode", navigationDto.getSiteCode());
        map.put("stateCode", navigationDto.getStateCode());
        map.put("systemInfoCode", navigationDto.getSystemInfoCode());
        map.put("target", navigationDto.getTarget());
        map.put("typeCode", navigationDto.getTypeCode());
        map.put("url", navigationDto.getUrl());
        map.put("version", navigationDto.getVersion());
        map.put("wfId", navigationDto.getWfId());

        return map;
    }
}