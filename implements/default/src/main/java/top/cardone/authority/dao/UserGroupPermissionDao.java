package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * UserGroupPermission
 *
 * @author yao hai tao
 */
public interface UserGroupPermissionDao extends PageDao {
    /**
     * 查询UserGroupPermission对象
     *
     * @param findOne UserGroupPermission标识
     * @return UserGroupPermission对象
     */
    Map<String, Object> findOneByUserGroupPermissionId(Map<String, Object> findOne);
}