package top.cardone.authority.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.RoleDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class RoleServiceImpl extends PageServiceImpl<RoleDao> implements top.cardone.authority.service.RoleService {
    @Override
    public Map<String, Object> findOneByRoleId(Map<String, Object> findOne) {
        return this.dao.findOneByRoleId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListForTree(findList);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.RoleService.init");

        return this.dao.generateData(flagObjectCode);
    }
}