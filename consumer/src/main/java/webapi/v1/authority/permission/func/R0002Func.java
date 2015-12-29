package webapi.v1.authority.permission.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.authority.dto.PermissionDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 许可 - 查询列表
 */
@Component("/web-api/v1/authority/permission/r0002.json")
public class R0002Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<PermissionDto> permissionDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (PermissionDto permissionDto : permissionDtoList) {
            mapList.add(this.toMap(permissionDto));
        }

        return mapList;
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
