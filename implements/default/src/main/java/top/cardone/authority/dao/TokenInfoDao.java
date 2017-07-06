package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息
 *
 * @author yao hai tao
 */
public interface TokenInfoDao extends PageDao {
    /**
     * 查询令牌信息对象
     *
     * @param findOne 令牌信息标识
     * @return 令牌信息对象
     */
    Map<String, Object> findOneByTokenInfoId(Map<String, Object> findOne);
}