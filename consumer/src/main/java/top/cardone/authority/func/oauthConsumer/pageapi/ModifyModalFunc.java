package top.cardone.authority.func.oauthConsumer.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 授权消费 - 修改
 */
@Component("/authority/oauthConsumer/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
