package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户组服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupServiceImpl extends PageServiceImpl<UserGroupDao> implements top.cardone.authority.service.UserGroupService {
    @Override
    public Map<String, Object> findOneByUserGroupId(Map<String, Object> findOne) {
        return this.dao.findOneByUserGroupId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListForTree(findList);
    }

    @Override
    @Transactional
    public void generateData() {
        String flagObjectCode = UUID.randomUUID().toString();

        this.generateData(flagObjectCode);

        //用户组与用户
        ApplicationContextHolder.getBean(UserGroupUserService.class).generateData(flagObjectCode);

        //角色
        ApplicationContextHolder.getBean(RoleService.class).generateData(flagObjectCode);

        //用户组与角色
        ApplicationContextHolder.getBean(UserGroupRoleService.class).generateData(flagObjectCode);

        //用户与角色
        ApplicationContextHolder.getBean(UserRoleService.class).generateData(flagObjectCode);

        //授权
        ApplicationContextHolder.getBean(PermissionService.class).generateData(flagObjectCode);

        //角色与授权
        ApplicationContextHolder.getBean(RolePermissionService.class).generateData(flagObjectCode);

        //用户组与授权
        ApplicationContextHolder.getBean(UserGroupPermissionService.class).generateData(flagObjectCode);

        //用户与授权
        ApplicationContextHolder.getBean(UserPermissionService.class).generateData(flagObjectCode);
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserGroupService.init");

        this.dao.generateData(flagObjectCode);
    }
}