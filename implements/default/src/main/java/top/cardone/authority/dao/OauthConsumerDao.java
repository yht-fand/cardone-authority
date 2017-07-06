package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 授权消费
 *
 * @author yao hai tao
 */
public interface OAuthConsumerDao extends PageDao {
    /**
     * 查询授权消费对象
     *
     * @param findOne 授权消费标识
     * @return 授权消费对象
     */
    Map<String, Object> findOneByOAuthConsumerId(Map<String, Object> findOne);
}