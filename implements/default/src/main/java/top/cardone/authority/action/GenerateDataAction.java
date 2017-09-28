package top.cardone.authority.action;

import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.lang3.BooleanUtils;
import top.cardone.authority.service.UserGroupService;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.action.Action0;
import top.cardone.core.util.func.Func2;

import java.util.Map;

/**
 * Created by cardo on 2017/9/11 0011.
 */
public class GenerateDataAction implements Action0 {
    @Setter
    private String readOneDictionaryValueByCodeFuncBeanId = "readOneDictionaryValueByCodeFunc";

    @Override
    public void action() {
        String value = (String) ApplicationContextHolder.getBean(Func2.class, this.readOneDictionaryValueByCodeFuncBeanId).func("authorityType", "authorityModify");

        if (!BooleanUtils.toBoolean(value)) {
            return;
        }

        ApplicationContextHolder.getBean(UserGroupService.class).generateData();

        Map<String, Object> save = Maps.newHashMap();

        save.put("dictionaryTypeCode", "authorityType");
        save.put("dictionaryCode", "authorityModify");
        save.put("value", "no");

        ApplicationContextHolder.getBean(Cache.class).clearBySkipNames("org.apache.shiro.session");
    }
}
