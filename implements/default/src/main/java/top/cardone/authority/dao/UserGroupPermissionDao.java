package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 用户组与许可
 *
 * @author yao hai tao
 */
public interface UserGroupPermissionDao extends PageDao {
    /**
     * 查询用户组与许可对象
     *
     * @param findOne 用户组与许可标识
     * @return 用户组与许可对象
     */
    Map<String, Object> findOneByUserGroupPermissionId(Map<String, Object> findOne);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}