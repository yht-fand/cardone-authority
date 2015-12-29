package top.cardone.authority.service.impl;

import top.cardone.authority.dao.UserGroupDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 用户组服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupServiceImpl extends SimpleDefaultService<UserGroupDao> implements top.cardone.authority.service.UserGroupService {
}