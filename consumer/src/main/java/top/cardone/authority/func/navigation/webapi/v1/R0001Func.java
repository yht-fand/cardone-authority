package top.cardone.authority.func.navigation.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.NavigationDto;
import top.cardone.authority.service.NavigationService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 导航 - 查询
 */
@Component("/web-api/v1/configuration/navigation/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        NavigationDto navigationDto = ApplicationContextHolder.getBean(NavigationService.class).findOne(NavigationDto.class, map);

        return this.toMap(navigationDto);
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