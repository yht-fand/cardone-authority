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
    public int generateData(String flagObjectCode, String userId, String userCode) {
        String findListForUserGroupRoleSqlFilePath = this.getSqlFilePath("findListForUserGroupRole");

        Map<String, Object> other = Maps.newHashMap();

        other.put("userId", userId);
        other.put("userCode", userCode);

        List<Map<String, Object>> forUserGroupRoleList = this.findList(findListForUserGroupRoleSqlFilePath, other);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        other.putAll(putAll);

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, other);

        for (Map<String, Object> forUserGroupRole : forUserGroupRoleList) {
            forUserGroupRole.putAll(putAll);

            count += this.saveOnConflict(forUserGroupRole);
        }

        return count;
    }
}