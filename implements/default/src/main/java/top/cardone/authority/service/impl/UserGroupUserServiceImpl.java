package top.cardone.authority.service.impl;

import top.cardone.authority.dao.UserGroupUserDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 用户组与用户服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupUserServiceImpl extends PageServiceImpl<UserGroupUserDao> implements top.cardone.authority.service.UserGroupUserService {
}