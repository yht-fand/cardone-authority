package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 用户组与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupPermissionServiceImpl extends PageServiceImpl<UserGroupPermissionDao> implements top.cardone.authority.service.UserGroupPermissionService {
    @Override
    public Map<String, Object> findOneByUserGroupPermissionId(Map<String, Object> findOne) {
        return this.dao.findOneByUserGroupPermissionId(findOne);
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
}