package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 角色与许可
 *
 * @author yao hai tao
 */
public interface RolePermissionDao extends PageDao {
    /**
     * 查询角色与许可对象
     *
     * @param findOne 角色与许可标识
     * @return 角色与许可对象
     */
    Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}