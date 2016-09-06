package top.cardone.func.vx.authority.oAuthConsumer;

import top.cardone.authority.service.OAuthConsumerService;
import com.google.common.collect.Table;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.TableUtils;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 授权消费 - 创建
 */
@Log4j2
@Component("/vx/authority/oAuthConsumer/c0001.json")
public class C0001Func implements Func1<Object, Map<String, Object>> {
    @Value("${app.root}/config/api/vx/authority/oAuthConsumer/c0001.input.json")
    private String inputJson;

    private void validate(Map<String, Object> inputMap) {
    }

    @Override
    public Object func(Map<String, Object> inputMap) {
        Table<String, String, String> inputTable;

        if (log.isDebugEnabled()) {
            inputTable = TableUtils.newTable(inputJson);
        } else {
            inputTable = ApplicationContextHolder.getBean(Cache.class).get("inputTable", inputJson, () -> TableUtils.newTable(inputJson));
        }

        Map<String, Object> newInputMap = top.cardone.context.util.MapUtils.newHashMap(inputMap, inputTable);

        validate(newInputMap);

        return ApplicationContextHolder.getBean(OAuthConsumerService.class).insertByNotExistsCache(newInputMap);
    }
}