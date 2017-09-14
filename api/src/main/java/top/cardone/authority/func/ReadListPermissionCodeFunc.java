package top.cardone.authority.func;

import com.google.common.collect.Sets;
import top.cardone.authority.service.UserPermissionService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Set;

/**
 * Created by cardone-home-001 on 2016/4/19.
 */
public class ReadListPermissionCodeFunc implements Func1<Set<String>, String> {
    @Override
    public Set<String> func(String userCode) {
        List<String> permissionCodeList = ApplicationContextHolder.getBean(UserPermissionService.class).readListPermissionCodeByUserCodeCache(userCode);

        return Sets.newHashSet(permissionCodeList);
    }
}
