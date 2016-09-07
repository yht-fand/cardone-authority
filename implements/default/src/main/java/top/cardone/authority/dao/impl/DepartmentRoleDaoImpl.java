package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 部门与角色
 *
 * @author yao hai tao
 */
public class DepartmentRoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.DepartmentRoleDao {
    @Override
    public Map<String, Object> findOneByDepartmentRoleId(Object departmentRoleId) {
        Map<String, Object> inputMap = Maps.newHashMap();

        inputMap.put("departmentRoleId", departmentRoleId);

        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, inputMap);
    }
}