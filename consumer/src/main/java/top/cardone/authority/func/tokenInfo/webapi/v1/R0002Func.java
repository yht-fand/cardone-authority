package top.cardone.authority.func.tokenInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.TokenInfoDto;
import top.cardone.authority.service.TokenInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息 - 查询列表
 */
@Component("/web-api/v1/configuration/tokenInfo/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<TokenInfoDto> tokenInfoDtoList = ApplicationContextHolder.getBean(TokenInfoService.class).findList(TokenInfoDto.class, map);

        return this.toMapList(tokenInfoDtoList);
    }

    private List<Map<String, Object>> toMapList(List<TokenInfoDto> tokenInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (TokenInfoDto tokenInfoDto : tokenInfoDtoList) {
            mapList.add(this.toMap(tokenInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(TokenInfoDto tokenInfoDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", tokenInfoDto.getBeginDate());
        map.put("clientId", tokenInfoDto.getClientId());
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
        map.put("scope", tokenInfoDto.getScope());
        map.put("siteCode", tokenInfoDto.getSiteCode());
        map.put("stateCode", tokenInfoDto.getStateCode());
        map.put("systemInfoCode", tokenInfoDto.getSystemInfoCode());
        map.put("tokenInfoCode", tokenInfoDto.getTokenInfoCode());
        map.put("tokenInfoId", tokenInfoDto.getTokenInfoId());
        map.put("userCode", tokenInfoDto.getUserCode());
        map.put("version", tokenInfoDto.getVersion());
        map.put("wfId", tokenInfoDto.getWfId());

        return map;
    }
}