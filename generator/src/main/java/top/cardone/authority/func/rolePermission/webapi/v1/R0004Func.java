package top.cardone.authority.func.rolePermission.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.RolePermissionDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 角色与许可 - 查询
 */
@Component("/web-api/v1/authority/rolePermission/r0004.json")
public class R0004Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<RolePermissionDto> rolePermissionDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (RolePermissionDto rolePermissionDto : rolePermissionDtoList) {
            mapList.add(this.toMap(rolePermissionDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(RolePermissionDto rolePermissionDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", rolePermissionDto.getBeginDate());
        map.put("createdByCode", rolePermissionDto.getCreatedByCode());
        map.put("createdDate", rolePermissionDto.getCreatedDate());
        map.put("dataStateCode", rolePermissionDto.getDataStateCode());
        map.put("departmentCode", rolePermissionDto.getDepartmentCode());
        map.put("endDate", rolePermissionDto.getEndDate());
        map.put("lastModifiedByCode", rolePermissionDto.getLastModifiedByCode());
        map.put("lastModifiedDate", rolePermissionDto.getLastModifiedDate());
        map.put("orgCode", rolePermissionDto.getOrgCode());
        map.put("permissionCode", rolePermissionDto.getPermissionCode());
        map.put("permissionCodes", rolePermissionDto.getPermissionCodes());
        map.put("roleCode", rolePermissionDto.getRoleCode());
        map.put("roleCodes", rolePermissionDto.getRoleCodes());
        map.put("rolePermissionId", rolePermissionDto.getRolePermissionId());
        map.put("stateCode", rolePermissionDto.getStateCode());
        map.put("version", rolePermissionDto.getVersion());
        map.put("wfId", rolePermissionDto.getWfId());

        return map;
    }
}
