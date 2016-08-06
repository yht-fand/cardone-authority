package top.cardone.authority.func.userGroup.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserGroupDto;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组 - 查询
 */
@Component("/web-api/v1/configuration/userGroup/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        UserGroupDto userGroupDto = ApplicationContextHolder.getBean(UserGroupService.class).findOne(UserGroupDto.class, map);

        return this.toMap(userGroupDto);
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
        map.put("siteCode", userGroupDto.getSiteCode());
        map.put("stateCode", userGroupDto.getStateCode());
        map.put("systemInfoCode", userGroupDto.getSystemInfoCode());
        map.put("userGroupCode", userGroupDto.getUserGroupCode());
        map.put("userGroupId", userGroupDto.getUserGroupId());
        map.put("version", userGroupDto.getVersion());
        map.put("wfId", userGroupDto.getWfId());

        return map;
    }
}