package top.cardone.authority.func.rolePermission.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.RolePermissionDto;
import top.cardone.authority.service.RolePermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 角色与许可 - 查询
 */
@Component("/web-api/v1/configuration/rolePermission/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        RolePermissionDto rolePermissionDto = ApplicationContextHolder.getBean(RolePermissionService.class).findOne(RolePermissionDto.class, map);

        return this.toMap(rolePermissionDto);
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