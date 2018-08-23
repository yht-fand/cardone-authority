package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户与许可
 *
 * @author yao hai tao
 */
public class UserPermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserPermissionDao {
    @Override
    public int generateData(String flagObjectCode, String userId, String userCode) {
        String findListForUserGroupPermissionSqlFilePath = this.getSqlFilePath("findListForUserGroupPermission");

        Map<String, Object> other = Maps.newHashMap();

        other.put("userId", userId);
        other.put("userCode", userCode);

        List<Map<String, Object>> forUserGroupPermissionList = this.findList(findListForUserGroupPermissionSqlFilePath,other);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        other.putAll(putAll);

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, other);

        for (Map<String, Object> forUserGroupPermission : forUserGroupPermissionList) {
            forUserGroupPermission.putAll(putAll);

            count += this.save(forUserGroupPermission);
        }

        return count;
    }
}