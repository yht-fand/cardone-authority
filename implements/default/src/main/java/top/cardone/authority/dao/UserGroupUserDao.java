package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

/**
 * 用户组与用户
 *
 * @author yao hai tao
 */
public interface UserGroupUserDao extends PageDao {
    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}