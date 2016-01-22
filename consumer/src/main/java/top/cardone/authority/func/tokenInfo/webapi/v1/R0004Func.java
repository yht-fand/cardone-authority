package top.cardone.authority.func.tokenInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.TokenInfoDto;
import top.cardone.authority.service.TokenInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 令牌信息 - 查询
 */
@Component("/web-api/v1/configuration/tokenInfo/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        TokenInfoDto tokenInfoDto = ApplicationContextHolder.getBean(TokenInfoService.class).findOne(TokenInfoDto.class, map);

        return this.toMap(tokenInfoDto);
    }

    private Map<String, Object> toMap(TokenInfoDto tokenInfoDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", tokenInfoDto.getBeginDate());
        map.put("createdByCode", tokenInfoDto.getCreatedByCode());
        map.put("createdDate", tokenInfoDto.getCreatedDate());
        map.put("dataStateCode", tokenInfoDto.getDataStateCode());
        map.put("departmentCode", tokenInfoDto.getDepartmentCode());
        map.put("endDate", tokenInfoDto.getEndDate());
        map.put("lastModifiedByCode", tokenInfoDto.getLastModifiedByCode());
        map.put("lastModifiedDate", tokenInfoDto.getLastModifiedDate());
        map.put("orgCode", tokenInfoDto.getOrgCode());
        map.put("permissionCodes", tokenInfoDto.getPermissionCodes());
        map.put("roleCodes", tokenInfoDto.getRoleCodes());
        map.put("siteCode", tokenInfoDto.getSiteCode());
        map.put("stateCode", tokenInfoDto.getStateCode());
        map.put("systemInfoCode", tokenInfoDto.getSystemInfoCode());
        map.put("tokenInfoCode", tokenInfoDto.getTokenInfoCode());
        map.put("tokenInfoId", tokenInfoDto.getTokenInfoId());
        map.put("version", tokenInfoDto.getVersion());
        map.put("wfId", tokenInfoDto.getWfId());

        return map;
    }
}