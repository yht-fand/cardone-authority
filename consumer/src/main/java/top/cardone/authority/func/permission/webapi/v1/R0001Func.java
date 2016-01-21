package top.cardone.authority.func.permission.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.PermissionDto;
import top.cardone.authority.service.PermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 许可 - 查询
 */
@Component("/web-api/v1/configuration/permission/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        PermissionDto permissionDto = ApplicationContextHolder.getBean(PermissionService.class).findOne(PermissionDto.class, map);

        return this.toMap(permissionDto);
    }

    private Map<String, Object> toMap(PermissionDto permissionDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", permissionDto.getBeginDate());
        map.put("createdByCode", permissionDto.getCreatedByCode());
        map.put("createdDate", permissionDto.getCreatedDate());
        map.put("dataStateCode", permissionDto.getDataStateCode());
        map.put("departmentCode", permissionDto.getDepartmentCode());
        map.put("endDate", permissionDto.getEndDate());
        map.put("lastModifiedByCode", permissionDto.getLastModifiedByCode());
        map.put("lastModifiedDate", permissionDto.getLastModifiedDate());
        map.put("orgCode", permissionDto.getOrgCode());
        map.put("parentCode", permissionDto.getParentCode());
        map.put("parentTreeCode", permissionDto.getParentTreeCode());
        map.put("parentTreeName", permissionDto.getParentTreeName());
        map.put("permissionCode", permissionDto.getPermissionCode());
        map.put("permissionCodes", permissionDto.getPermissionCodes());
        map.put("permissionId", permissionDto.getPermissionId());
        map.put("roleCodes", permissionDto.getRoleCodes());
        map.put("stateCode", permissionDto.getStateCode());
        map.put("version", permissionDto.getVersion());
        map.put("wfId", permissionDto.getWfId());

        return map;
    }
}