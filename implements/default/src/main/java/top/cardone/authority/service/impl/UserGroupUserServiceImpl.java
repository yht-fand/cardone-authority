package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupUserDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupUserServiceImpl extends PageServiceImpl<UserGroupUserDao> implements top.cardone.authority.service.UserGroupUserService {
    @Override
    public Map<String, Object> findOneByUserGroupUserId(Map<String, Object> findOne) {
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

    @Override
    public List<Map<String, Object>> findListByUserId(Map<String, Object> findList) {
        return this.dao.findListByUserId(findList);
    }
}