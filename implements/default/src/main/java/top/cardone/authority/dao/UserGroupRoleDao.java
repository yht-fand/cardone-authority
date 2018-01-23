package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 用户组与角色
 *
 * @author yao hai tao
 */
public interface UserGroupRoleDao extends PageDao {
    /**
     * 查询用户组与角色对象
     *
     * @param findOne 用户组与角色标识
     * @return 用户组与角色对象
     */
    Map<String, Object> findOneByUserGroupRoleId(Map<String, Object> findOne);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}