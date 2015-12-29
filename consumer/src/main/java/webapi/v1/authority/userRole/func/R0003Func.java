package webapi.v1.authority.userRole.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.UserRoleDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色 - 查询分页
 */
@Component("/web-api/v1/authority/userRole/r0003.json")
public class R0003Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
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
        map.put("stateCode", userRoleDto.getStateCode());
        map.put("userCode", userRoleDto.getUserCode());
        map.put("userRoleId", userRoleDto.getUserRoleId());
        map.put("version", userRoleDto.getVersion());
        map.put("wfId", userRoleDto.getWfId());

        return map;
    }
}
