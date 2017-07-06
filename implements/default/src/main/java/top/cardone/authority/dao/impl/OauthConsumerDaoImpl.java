package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 授权消费
 *
 * @author yao hai tao
 */
public class OAuthConsumerDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.OAuthConsumerDao {
    @Override
    public Map<String, Object> findOneByOAuthConsumerId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }
}