package top.cardone.authority.func.role.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.RoleDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 角色 - 查询
 */
@Component("/web-api/v1/authority/role/r0001.json")
public class R0001Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
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
        map.put("stateCode", roleDto.getStateCode());
        map.put("version", roleDto.getVersion());
        map.put("wfId", roleDto.getWfId());

        return map;
    }
}
