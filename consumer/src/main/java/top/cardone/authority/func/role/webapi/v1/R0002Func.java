package top.cardone.authority.func.role.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.RoleDto;
import top.cardone.authority.service.RoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 角色 - 查询列表
 */
@Component("/web-api/v1/configuration/role/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<RoleDto> roleDtoList = ApplicationContextHolder.getBean(RoleService.class).findList(RoleDto.class, map);

        return this.toMapList(roleDtoList);
    }

    private List<Map<String, Object>> toMapList(List<RoleDto> roleDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (RoleDto roleDto : roleDtoList) {
            mapList.add(this.toMap(roleDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(RoleDto roleDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", roleDto.getBeginDate());
        map.put("createdByCode", roleDto.getCreatedByCode());
        map.put("createdDate", roleDto.getCreatedDate());
        map.put("dataStateCode", roleDto.getDataStateCode());
        map.put("departmentCode", roleDto.getDepartmentCode());
        map.put("endDate", roleDto.getEndDate());
        map.put("lastModifiedByCode", roleDto.getLastModifiedByCode());
        map.put("lastModifiedDate", roleDto.getLastModifiedDate());
        map.put("name", roleDto.getName());
        map.put("orgCode", roleDto.getOrgCode());
        map.put("permissionCodes", roleDto.getPermissionCodes());
        map.put("roleCode", roleDto.getRoleCode());
        map.put("roleCodes", roleDto.getRoleCodes());
        map.put("roleId", roleDto.getRoleId());
        map.put("siteCode", roleDto.getSiteCode());
        map.put("stateCode", roleDto.getStateCode());
        map.put("systemInfoCode", roleDto.getSystemInfoCode());
        map.put("version", roleDto.getVersion());
        map.put("wfId", roleDto.getWfId());

        return map;
    }
}