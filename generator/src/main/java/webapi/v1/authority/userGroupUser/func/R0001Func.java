package webapi.v1.authority.userGroupUser.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.UserGroupUserDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户 - 查询
 */
@Component("/web-api/v1/authority/userGroupUser/r0001.json")
public class R0001Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<UserGroupUserDto> userGroupUserDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (UserGroupUserDto userGroupUserDto : userGroupUserDtoList) {
            mapList.add(this.toMap(userGroupUserDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(UserGroupUserDto userGroupUserDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userGroupUserDto.getBeginDate());
        map.put("createdByCode", userGroupUserDto.getCreatedByCode());
        map.put("createdDate", userGroupUserDto.getCreatedDate());
        map.put("dataStateCode", userGroupUserDto.getDataStateCode());
        map.put("departmentCode", userGroupUserDto.getDepartmentCode());
        map.put("endDate", userGroupUserDto.getEndDate());
        map.put("lastModifiedByCode", userGroupUserDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userGroupUserDto.getLastModifiedDate());
        map.put("orgCode", userGroupUserDto.getOrgCode());
        map.put("permissionCodes", userGroupUserDto.getPermissionCodes());
        map.put("roleCodes", userGroupUserDto.getRoleCodes());
        map.put("stateCode", userGroupUserDto.getStateCode());
        map.put("userCode", userGroupUserDto.getUserCode());
        map.put("userGroupCode", userGroupUserDto.getUserGroupCode());
        map.put("userGroupUserId", userGroupUserDto.getUserGroupUserId());
        map.put("version", userGroupUserDto.getVersion());
        map.put("wfId", userGroupUserDto.getWfId());

        return map;
    }
}
