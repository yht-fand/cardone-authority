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
    public Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne) {
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
        String findListForUserGroupPermissionSqlFilePath = this.getSqlFilePath("findListForUserGroupPermission");

        List<Map<String, Object>> forUserGroupPermissionList = this.findList(findListForUserGroupPermissionSqlFilePath);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        for (Map<String, Object> forUserGroupPermission : forUserGroupPermissionList) {
            forUserGroupPermission.putAll(putAll);

            count += this.insertByNotExists(forUserGroupPermission);
        }

        return count;
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        String sqlFilePath = this.getSqlFilePath("readListPermissionCodeByUserCode");

        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.readList(String.class, sqlFilePath, readList);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String userCode, String functionCode) {
        String findOneSqlFilePath = this.getSqlFilePath("findOneByFunctionCode");

        Map<String, Object> findOne = Maps.newHashMap();

        findOne.put("userCode", userCode);
        findOne.put("functionCode", functionCode);

        return this.findOne(findOneSqlFilePath, findOne);
    }
}