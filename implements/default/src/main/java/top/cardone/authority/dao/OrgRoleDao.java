package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 组织与角色
 *
 * @author yao hai tao
 */
public interface OrgRoleDao extends PageDao {
    /**
     * 查询组织与角色对象
     *
     * @param orgRoleId 组织与角色标识
     * @return 组织与角色对象
     */
    Map<String, Object> findOneByOrgRoleId(Object orgRoleId);
}