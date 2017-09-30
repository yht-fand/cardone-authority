package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.PermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class PermissionServiceImpl extends PageServiceImpl<PermissionDao> implements top.cardone.authority.service.PermissionService {
    @Override
    public Map<String, Object> findOneByPermissionId(Map<String, Object> findOne) {
        return this.dao.findOneByPermissionId(findOne);
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
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.PermissionService.init");

        this.dao.generateData(flagObjectCode);
    }
}