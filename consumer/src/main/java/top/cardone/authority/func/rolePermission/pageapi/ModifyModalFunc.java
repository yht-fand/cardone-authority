package top.cardone.authority.func.rolePermission.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 角色与许可 - 修改
 */
@Component("/authority/rolePermission/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
