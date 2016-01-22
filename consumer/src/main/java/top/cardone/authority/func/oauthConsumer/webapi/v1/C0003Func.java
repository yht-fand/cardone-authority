package top.cardone.authority.func.oauthConsumer.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.authority.service.OauthConsumerService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 授权消费 - 创建
 */
@Component("/web-api/v1/configuration/oauthConsumer/c0003.json")
public class C0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(OauthConsumerService.class).save(map);
    }
}
