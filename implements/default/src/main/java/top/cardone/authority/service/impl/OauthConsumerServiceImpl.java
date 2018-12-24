package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.OauthConsumerDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 授权消费服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class OauthConsumerServiceImpl extends PageServiceImpl<OauthConsumerDao> implements top.cardone.authority.service.OauthConsumerService {
    @Override
    public Map<String, Object> findOneByOauthConsumerId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }
}