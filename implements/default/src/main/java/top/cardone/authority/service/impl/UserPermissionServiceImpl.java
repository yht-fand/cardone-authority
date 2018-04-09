package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

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
    public void generateData() {
        ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        return this.dao.readListPermissionCodeByUserCode(userCode);
    }

    @Override
    public List<String> readListPermissionCodeByPermission(String userCode, String permission) {
        return this.dao.readListPermissionCodeByPermission(userCode, permission);
    }
}