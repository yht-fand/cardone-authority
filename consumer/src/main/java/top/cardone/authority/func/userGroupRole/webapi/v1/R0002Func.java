package top.cardone.authority.func.userGroupRole.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserGroupRoleDto;
import top.cardone.authority.service.UserGroupRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 用户组与角色 - 查询列表
 */
@Component("/web-api/v1/configuration/userGroupRole/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<UserGroupRoleDto> userGroupRoleDtoList = ApplicationContextHolder.getBean(UserGroupRoleService.class).findList(UserGroupRoleDto.class, map);

        return this.toMapList(userGroupRoleDtoList);
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