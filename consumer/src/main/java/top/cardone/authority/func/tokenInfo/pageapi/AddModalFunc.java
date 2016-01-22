package top.cardone.authority.func.tokenInfo.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 令牌信息 - 添加
 */
@Component("/authority/tokenInfo/addModal.json")
public class AddModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
