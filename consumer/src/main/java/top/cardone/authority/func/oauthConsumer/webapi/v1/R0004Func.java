package top.cardone.authority.func.oauthConsumer.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.authority.dto.OauthConsumerDto;
import top.cardone.authority.service.OauthConsumerService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 授权消费 - 查询
 */
@Component("/web-api/v1/configuration/oauthConsumer/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        OauthConsumerDto oauthConsumerDto = ApplicationContextHolder.getBean(OauthConsumerService.class).findOne(OauthConsumerDto.class, map);

        return this.toMap(oauthConsumerDto);
    }

    private Map<String, Object> toMap(OauthConsumerDto oauthConsumerDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", oauthConsumerDto.getBeginDate());
        map.put("clientId", oauthConsumerDto.getClientId());
        map.put("clientSecret", oauthConsumerDto.getClientSecret());
        map.put("createdByCode", oauthConsumerDto.getCreatedByCode());
        map.put("createdDate", oauthConsumerDto.getCreatedDate());
        map.put("dataStateCode", oauthConsumerDto.getDataStateCode());
        map.put("departmentCode", oauthConsumerDto.getDepartmentCode());
        map.put("endDate", oauthConsumerDto.getEndDate());
        map.put("lastModifiedByCode", oauthConsumerDto.getLastModifiedByCode());
        map.put("lastModifiedDate", oauthConsumerDto.getLastModifiedDate());
        map.put("oauthConsumerId", oauthConsumerDto.getOauthConsumerId());
        map.put("orgCode", oauthConsumerDto.getOrgCode());
        map.put("permissionCodes", oauthConsumerDto.getPermissionCodes());
        map.put("roleCodes", oauthConsumerDto.getRoleCodes());
        map.put("siteCode", oauthConsumerDto.getSiteCode());
        map.put("stateCode", oauthConsumerDto.getStateCode());
        map.put("systemInfoCode", oauthConsumerDto.getSystemInfoCode());
        map.put("version", oauthConsumerDto.getVersion());
        map.put("wfId", oauthConsumerDto.getWfId());

        return map;
    }
}