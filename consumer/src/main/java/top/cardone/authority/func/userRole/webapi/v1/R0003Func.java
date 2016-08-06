package top.cardone.authority.func.userRole.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserRoleDto;
import top.cardone.authority.service.UserRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色 - 查询分页
 */
@Component("/web-api/v1/configuration/userRole/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<UserRoleDto> userRoleDtoPage = ApplicationContextHolder.getBean(UserRoleService.class).page(UserRoleDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(userRoleDtoPage.getContent()), map, userRoleDtoPage.getTotalElements());
    }

    private List<Map<String, Object>> toMapList(List<UserRoleDto> userRoleDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (UserRoleDto userRoleDto : userRoleDtoList) {
            mapList.add(this.toMap(userRoleDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(UserRoleDto userRoleDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userRoleDto.getBeginDate());
        map.put("createdByCode", userRoleDto.getCreatedByCode());
        map.put("createdDate", userRoleDto.getCreatedDate());
        map.put("dataStateCode", userRoleDto.getDataStateCode());
        map.put("departmentCode", userRoleDto.getDepartmentCode());
        map.put("endDate", userRoleDto.getEndDate());
        map.put("flagCode", userRoleDto.getFlagCode());
        map.put("lastModifiedByCode", userRoleDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userRoleDto.getLastModifiedDate());
        map.put("orgCode", userRoleDto.getOrgCode());
        map.put("permissionCodes", userRoleDto.getPermissionCodes());
        map.put("roleCode", userRoleDto.getRoleCode());
        map.put("roleCodes", userRoleDto.getRoleCodes());
        map.put("siteCode", userRoleDto.getSiteCode());
        map.put("stateCode", userRoleDto.getStateCode());
        map.put("systemInfoCode", userRoleDto.getSystemInfoCode());
        map.put("userCode", userRoleDto.getUserCode());
        map.put("userRoleId", userRoleDto.getUserRoleId());
        map.put("version", userRoleDto.getVersion());
        map.put("wfId", userRoleDto.getWfId());

        return map;
    }
}