package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色
 *
 * @author yao hai tao
 */
public class UserRoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserRoleDao {
    @Override
    public int generateData(String flagObjectCode) {
        String findListForUserGroupRoleSqlFilePath = this.getSqlFilePath("findListForUserGroupRole");

        List<Map<String, Object>> forUserGroupRoleList = this.findList(findListForUserGroupRoleSqlFilePath);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        for (Map<String, Object> forUserGroupRole : forUserGroupRoleList) {
            forUserGroupRole.putAll(putAll);

            count += this.save(forUserGroupRole);
        }

        return count;
    }

    @Override
    public List<String> readListRoleCodeByUserCode(String userCode) {
        String sqlFilePath = this.getSqlFilePath("readListRoleCodeByUserCode");

        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.readList(String.class, sqlFilePath, readList);
    }
}