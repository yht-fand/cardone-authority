package top.cardone.authority.service.impl;

import top.cardone.authority.dao.RolePermissionDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 角色与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class RolePermissionServiceImpl extends SimpleDefaultService<RolePermissionDao> implements top.cardone.authority.service.RolePermissionService {
}