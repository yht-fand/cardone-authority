package top.cardone.authority.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.cache.Caches;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserPermissionServiceImpl extends PageServiceImpl<UserPermissionDao> implements top.cardone.authority.service.UserPermissionService {
    @Override
    public Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne) {
        return this.dao.findOneByUserPermissionId(findOne);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserPermissionService.init");

        return this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        return this.dao.readListPermissionCodeByUserCode(userCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String userCode, String functionCode) {
        if (StringUtils.isBlank(userCode)) {
            userCode = (String) SecurityUtils.getSubject().getPrincipal();
        }

        return this.dao.findOneByFunctionCode(userCode, functionCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String functionCode) {
        return this.findOneByFunctionCode(null, functionCode);
    }

    @Override
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    public Map<String, Object> findOneByFunctionCodeCache(String userCode, String functionCode) {
        Map<String, Object> map = this.findOneByFunctionCode(userCode, functionCode);

        for (Map.Entry<String, Object> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() == null) {
                mapEntry.setValue(UUID.randomUUID().toString());

                continue;
            }

            if (StringUtils.contains((String) mapEntry.getValue(), "*")) {
                mapEntry.setValue(StringUtils.EMPTY);
            }
        }

        return map;
    }

    @Override
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    public Map<String, Object> findOneByFunctionCodeCache(String functionCode) {
        return this.findOneByFunctionCode(functionCode);
    }
}