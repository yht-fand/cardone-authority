package top.cardone.func.vx.authority.userGroupUser;

import top.cardone.authority.service.UserGroupUserService;
import com.google.common.collect.Table;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import top.cardone.cache.Cache;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.context.util.TableUtils;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 用户组与用户 - 修改
 */
@Log4j2
@Component("/vx/authority/userGroupUser/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    @Value("${app.root}/config/api/vx/authority/userGroupUser/modifyModal.input.json")
    private String inputJson;

    @Value("${app.root}/config/api/vx/authority/userGroupUser/modifyModal.output.json")
    private String outputJson;

    private void validate(Map<String, Object> inputMap) {
        String userGroupUserId = MapUtils.getString(inputMap, "userGroupUserId");

        if (StringUtils.isBlank(userGroupUserId)) {
            throw new CodeException("用户组与用户标识不能为空值!");
        }
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

        Map<String, Object> outputMap = ApplicationContextHolder.getBean(UserGroupUserService.class).findOneByUserGroupUserId(newInputMap);

        Table<String, String, String> outputTable;

        if (log.isDebugEnabled()) {
            outputTable = TableUtils.newTable(outputJson);
        } else {
            outputTable = ApplicationContextHolder.getBean(Cache.class).get("outputTable", outputJson, () -> TableUtils.newTable(outputJson));
        }

        return MapUtils.newHashMap(outputMap, outputTable);
    }
}