package top.cardone.authority.func.tokenInfo.webapi.v1;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Component;
import top.cardone.authority.service.TokenInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息 - 批量修改
 */
@Component("/web-api/v1/configuration/tokenInfo/u0002.json")
public class U0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<Object> updateList = (List<Object>) MapUtils.getObject(map, "datas");

        return ApplicationContextHolder.getBean(TokenInfoService.class).updateList(updateList);
    }
}
