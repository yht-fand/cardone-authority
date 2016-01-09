package top.cardone.authority.func.navigation.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.NavigationDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 导航 - 查询
 */
@Component("/web-api/v1/authority/navigation/r0004.json")
public class R0004Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
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
        map.put("stateCode", navigationDto.getStateCode());
        map.put("target", navigationDto.getTarget());
        map.put("typeCode", navigationDto.getTypeCode());
        map.put("url", navigationDto.getUrl());
        map.put("version", navigationDto.getVersion());
        map.put("wfId", navigationDto.getWfId());

        return map;
    }
}
