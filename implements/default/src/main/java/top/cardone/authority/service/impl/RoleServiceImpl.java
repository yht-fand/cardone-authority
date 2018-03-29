package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.RoleDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

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
    public void generateData() {
        ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }
}