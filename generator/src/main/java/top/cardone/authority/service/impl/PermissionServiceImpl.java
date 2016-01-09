package top.cardone.authority.service.impl;

import top.cardone.authority.dao.PermissionDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class PermissionServiceImpl extends PageServiceImpl<PermissionDao> implements top.cardone.authority.service.PermissionService {
}