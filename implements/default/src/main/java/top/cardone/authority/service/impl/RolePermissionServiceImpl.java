package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.RolePermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 角色与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class RolePermissionServiceImpl extends PageServiceImpl<RolePermissionDao> implements top.cardone.authority.service.RolePermissionService {
    @Override
    public Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
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