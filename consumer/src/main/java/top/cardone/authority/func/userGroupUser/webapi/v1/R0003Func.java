package top.cardone.authority.func.userGroupUser.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserGroupUserDto;
import top.cardone.authority.service.UserGroupUserService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户 - 查询分页
 */
@Component("/web-api/v1/configuration/userGroupUser/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<UserGroupUserDto> userGroupUserDtoPage = ApplicationContextHolder.getBean(UserGroupUserService.class).page(UserGroupUserDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(userGroupUserDtoPage.getContent()), map, userGroupUserDtoPage.getTotalElements());
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
        map.put("siteCode", userGroupUserDto.getSiteCode());
        map.put("stateCode", userGroupUserDto.getStateCode());
        map.put("systemInfoCode", userGroupUserDto.getSystemInfoCode());
        map.put("userCode", userGroupUserDto.getUserCode());
        map.put("userGroupCode", userGroupUserDto.getUserGroupCode());
        map.put("userGroupUserId", userGroupUserDto.getUserGroupUserId());
        map.put("version", userGroupUserDto.getVersion());
        map.put("wfId", userGroupUserDto.getWfId());

        return map;
    }
}