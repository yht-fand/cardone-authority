package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户组与许可
 *
 * @author yao hai tao
 */
public class UserGroupPermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupPermissionDao {
    @Override
    public Map<String, Object> findOneByUserGroupPermissionId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }

    @Override
    public int generateData(String flagObjectCode) {
        String findListForRolePermissionSqlFilePath = this.getSqlFilePath("findListForRolePermission");

        List<Map<String, Object>> forRolePermissionList = this.findList(findListForRolePermissionSqlFilePath);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        for (Map<String, Object> forRolePermission : forRolePermissionList) {
            forRolePermission.putAll(putAll);

            count += this.save(forRolePermission);
        }

        return count;
    }
}