package top.cardone.authority.service.impl;

import top.cardone.authority.dao.RoleDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class RoleServiceImpl extends PageServiceImpl<RoleDao> implements top.cardone.authority.service.RoleService {
}