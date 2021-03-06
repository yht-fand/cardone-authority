package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.RoleDao;
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
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListBySqlFileName("findListForTree", findList);
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }
}