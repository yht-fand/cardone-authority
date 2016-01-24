package top.cardone.authority.func.userPermission.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.UserPermissionDto;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户与许可 - 查询
 */
@Component("/web-api/v1/configuration/userPermission/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        UserPermissionDto userPermissionDto = ApplicationContextHolder.getBean(UserPermissionService.class).findOne(UserPermissionDto.class, map);

        return this.toMap(userPermissionDto);
    }

    private Map<String, Object> toMap(UserPermissionDto userPermissionDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", userPermissionDto.getBeginDate());
        map.put("createdByCode", userPermissionDto.getCreatedByCode());
        map.put("createdDate", userPermissionDto.getCreatedDate());
        map.put("dataStateCode", userPermissionDto.getDataStateCode());
        map.put("departmentCode", userPermissionDto.getDepartmentCode());
        map.put("endDate", userPermissionDto.getEndDate());
        map.put("flagCode", userPermissionDto.getFlagCode());
        map.put("lastModifiedByCode", userPermissionDto.getLastModifiedByCode());
        map.put("lastModifiedDate", userPermissionDto.getLastModifiedDate());
        map.put("orgCode", userPermissionDto.getOrgCode());
        map.put("permissionCode", userPermissionDto.getPermissionCode());
        map.put("permissionCodes", userPermissionDto.getPermissionCodes());
        map.put("roleCodes", userPermissionDto.getRoleCodes());
        map.put("siteCode", userPermissionDto.getSiteCode());
        map.put("stateCode", userPermissionDto.getStateCode());
        map.put("systemInfoCode", userPermissionDto.getSystemInfoCode());
        map.put("userCode", userPermissionDto.getUserCode());
        map.put("userPermissionId", userPermissionDto.getUserPermissionId());
        map.put("version", userPermissionDto.getVersion());
        map.put("wfId", userPermissionDto.getWfId());

        return map;
    }
}