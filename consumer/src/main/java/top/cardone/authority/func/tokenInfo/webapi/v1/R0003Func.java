package top.cardone.authority.func.tokenInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.TokenInfoDto;
import top.cardone.authority.service.TokenInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息 - 查询分页
 */
@Component("/web-api/v1/configuration/tokenInfo/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<TokenInfoDto> tokenInfoDtoPage = ApplicationContextHolder.getBean(TokenInfoService.class).page(TokenInfoDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(tokenInfoDtoPage.getContent()), map, tokenInfoDtoPage.getTotalElements()));
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