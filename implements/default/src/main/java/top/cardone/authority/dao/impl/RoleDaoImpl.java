package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 角色
 *
 * @author yao hai tao
 */
public class RoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.RoleDao {
    @Override
    public List<String> readListRoleCodeByUserCode(String userCode) {
        String sqlFilePath = this.getSqlFilePath("selectRoleCodeByUserCode");

        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.readList(String.class, sqlFilePath, readList);
    }
}