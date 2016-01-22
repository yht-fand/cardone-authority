package top.cardone.authority.func.tokenInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.TokenInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 令牌信息 - 创建
 */
@Component("/web-api/v1/configuration/tokenInfo/c0004.json")
public class C0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(TokenInfoService.class).save(map);
    }
}
