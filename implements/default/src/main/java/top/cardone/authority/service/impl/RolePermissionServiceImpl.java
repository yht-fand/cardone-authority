package top.cardone.authority.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.RolePermissionDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 角色与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class RolePermissionServiceImpl extends PageServiceImpl<RolePermissionDao> implements top.cardone.authority.service.RolePermissionService {
    @Override
    public Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne) {
        return this.dao.findOneByRolePermissionId(findOne);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.RolePermissionService.init");

        return this.dao.generateData(flagObjectCode);
    }
}