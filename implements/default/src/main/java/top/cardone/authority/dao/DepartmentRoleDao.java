package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 部门与角色
 *
 * @author yao hai tao
 */
public interface DepartmentRoleDao extends PageDao {
    /**
     * 查询部门与角色对象
     *
     * @param departmentRoleId 部门与角色标识
     * @return 部门与角色对象
     */
    Map<String, Object> findOneByDepartmentRoleId(Object departmentRoleId);
}