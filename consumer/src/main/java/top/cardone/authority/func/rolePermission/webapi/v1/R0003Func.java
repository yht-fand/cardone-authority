package top.cardone.authority.func.rolePermission.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.RolePermissionDto;
import top.cardone.authority.service.RolePermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 角色与许可 - 查询分页
 */
@Component("/web-api/v1/configuration/rolePermission/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<RolePermissionDto> rolePermissionDtoPage = ApplicationContextHolder.getBean(RolePermissionService.class).page(RolePermissionDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(rolePermissionDtoPage.getContent()), map, rolePermissionDtoPage.getTotalElements());
    }

    private List<Map<String, Object>> toMapList(List<RolePermissionDto> rolePermissionDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (RolePermissionDto rolePermissionDto : rolePermissionDtoList) {
            mapList.add(this.toMap(rolePermissionDto));
        }

        return mapList;
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
        map.put("siteCode", rolePermissionDto.getSiteCode());
        map.put("stateCode", rolePermissionDto.getStateCode());
        map.put("systemInfoCode", rolePermissionDto.getSystemInfoCode());
        map.put("version", rolePermissionDto.getVersion());
        map.put("wfId", rolePermissionDto.getWfId());

        return map;
    }
}