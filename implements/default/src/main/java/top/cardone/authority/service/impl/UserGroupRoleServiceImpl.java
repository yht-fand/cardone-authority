package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupRoleDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 用户组与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupRoleServiceImpl extends PageServiceImpl<UserGroupRoleDao> implements top.cardone.authority.service.UserGroupRoleService {
    @Override
    public Map<String, Object> findOneByUserGroupRoleId(Map<String, Object> findOne) {
        return this.dao.findOneByUserGroupRoleId(findOne);
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