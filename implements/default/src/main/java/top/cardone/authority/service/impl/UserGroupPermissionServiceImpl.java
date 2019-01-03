package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupPermissionDao;
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
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }
}