package top.cardone.authority.service.impl;

import top.cardone.authority.dao.NavigationDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class NavigationServiceImpl extends SimpleDefaultService<NavigationDao> implements top.cardone.authority.service.NavigationService {
}