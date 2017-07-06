package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.OAuthConsumerDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 授权消费服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class OAuthConsumerServiceImpl extends PageServiceImpl<OAuthConsumerDao> implements top.cardone.authority.service.OAuthConsumerService {
    @Override
    public Map<String, Object> findOneByOAuthConsumerId(Map<String, Object> findOne) {
        return this.dao.findOneByOAuthConsumerId(findOne);
    }
}