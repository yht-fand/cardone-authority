package top.cardone.authority.service.impl;

import top.cardone.authority.dao.OauthConsumerDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 授权消费服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class OauthConsumerServiceImpl extends PageServiceImpl<OauthConsumerDao> implements top.cardone.authority.service.OauthConsumerService {
}