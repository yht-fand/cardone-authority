package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 令牌信息
 *
 * @author yao hai tao
 */
public class TokenInfoDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.TokenInfoDao {
    @Override
    public Map<String, Object> findOneByTokenInfoId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }
}