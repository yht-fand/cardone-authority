package top.cardone.authority.service.impl;

import top.cardone.authority.dao.UserRoleDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 用户与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserRoleServiceImpl extends SimpleDefaultService<UserRoleDao> implements top.cardone.authority.service.UserRoleService {
}