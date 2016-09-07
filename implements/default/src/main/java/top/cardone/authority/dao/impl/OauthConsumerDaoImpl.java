package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 授权消费
 *
 * @author yao hai tao
 */
public class OAuthConsumerDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.OAuthConsumerDao {
    @Override
    public Map<String, Object> findOneByOAuthConsumerId(Object oAuthConsumerId) {
        Map<String, Object> inputMap = Maps.newHashMap();
		
        inputMap.put("oAuthConsumerId", oAuthConsumerId);
		
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, inputMap);
    }
}