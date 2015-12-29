package webapi.v1.authority.userGroupRole.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.UserGroupRoleDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 用户组与角色 - 查询
 */
@Component("/web-api/v1/authority/userGroupRole/r0001.json")
public class R0001Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<UserGroupRoleDto> userGroupRoleDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (UserGroupRoleDto userGroupRoleDto : userGroupRoleDtoList) {
            mapList.add(this.toMap(userGroupRoleDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(UserGroupRoleDto userGroupRoleDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userGroupRoleDto.getBeginDate());
        map.put("createdByCode", userGroupRoleDto.getCreatedByCode());
        map.put("createdDate", userGroupRoleDto.getCreatedDate());
        map.put("dataStateCode", userGroupRoleDto.getDataStateCode());
        map.put("departmentCode", userGroupRoleDto.getDepartmentCode());
        map.put("endDate", userGroupRoleDto.getEndDate());
        map.put("lastModifiedByCode", userGroupRoleDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userGroupRoleDto.getLastModifiedDate());
        map.put("orgCode", userGroupRoleDto.getOrgCode());
        map.put("permissionCodes", userGroupRoleDto.getPermissionCodes());
        map.put("roleCode", userGroupRoleDto.getRoleCode());
        map.put("roleCodes", userGroupRoleDto.getRoleCodes());
        map.put("stateCode", userGroupRoleDto.getStateCode());
        map.put("userGroupCode", userGroupRoleDto.getUserGroupCode());
        map.put("userGroupRoleId", userGroupRoleDto.getUserGroupRoleId());
        map.put("version", userGroupRoleDto.getVersion());
        map.put("wfId", userGroupRoleDto.getWfId());

        return map;
    }
}
