package top.cardone.authority.service.impl;

import top.cardone.authority.dao.NavigationDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class NavigationServiceImpl extends PageServiceImpl<NavigationDao> implements top.cardone.authority.service.NavigationService {
}