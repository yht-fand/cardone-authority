package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 组织与角色
 *
 * @author yao hai tao
 */
public class OrgRoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.OrgRoleDao {
    @Override
    public Map<String, Object> findOneByOrgRoleId(Object orgRoleId) {
        Map<String, Object> inputMap = Maps.newHashMap();

        inputMap.put("orgRoleId", orgRoleId);

        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, inputMap);
    }
}