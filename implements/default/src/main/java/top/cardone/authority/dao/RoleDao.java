package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

/**
 * 角色
 *
 * @author yao hai tao
 */
public interface RoleDao extends PageDao {
    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}