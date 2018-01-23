package top.cardone.authority.func;

import com.google.common.collect.Sets;
import lombok.Setter;
import lombok.Synchronized;
import org.springframework.util.CollectionUtils;
import top.cardone.authority.service.UserRoleService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Set;

/**
 * Created by cardone-home-001 on 2016/4/19.
 */
public class ReadListRoleCodeFunc implements Func1<Set<String>, String> {
    @Setter
    private String defaultRoleCode = "general";

    @Override
    @Synchronized
    public Set<String> func(String userCode) {
        List<String> roleCodeList = ApplicationContextHolder.getBean(UserRoleService.class).readListRoleCodeByUserCodeCache(userCode);

        if (CollectionUtils.isEmpty(roleCodeList)) {
            roleCodeList.add(defaultRoleCode);
        }

        return Sets.newHashSet(roleCodeList);
    }
}
