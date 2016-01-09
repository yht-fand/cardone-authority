package top.cardone.authority.func.userGroup.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.UserGroupDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 用户组 - 查询
 */
@Component("/web-api/v1/authority/userGroup/r0004.json")
public class R0004Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<UserGroupDto> userGroupDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (UserGroupDto userGroupDto : userGroupDtoList) {
            mapList.add(this.toMap(userGroupDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(UserGroupDto userGroupDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userGroupDto.getBeginDate());
        map.put("createdByCode", userGroupDto.getCreatedByCode());
        map.put("createdDate", userGroupDto.getCreatedDate());
        map.put("dataStateCode", userGroupDto.getDataStateCode());
        map.put("departmentCode", userGroupDto.getDepartmentCode());
        map.put("endDate", userGroupDto.getEndDate());
        map.put("lastModifiedByCode", userGroupDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userGroupDto.getLastModifiedDate());
        map.put("name", userGroupDto.getName());
        map.put("order", userGroupDto.getOrder());
        map.put("orgCode", userGroupDto.getOrgCode());
        map.put("parentCode", userGroupDto.getParentCode());
        map.put("parentTreeCode", userGroupDto.getParentTreeCode());
        map.put("parentTreeName", userGroupDto.getParentTreeName());
        map.put("permissionCodes", userGroupDto.getPermissionCodes());
        map.put("roleCodes", userGroupDto.getRoleCodes());
        map.put("stateCode", userGroupDto.getStateCode());
        map.put("userGroupCode", userGroupDto.getUserGroupCode());
        map.put("userGroupId", userGroupDto.getUserGroupId());
        map.put("version", userGroupDto.getVersion());
        map.put("wfId", userGroupDto.getWfId());

        return map;
    }
}
