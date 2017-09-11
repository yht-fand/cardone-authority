package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户
 *
 * @author yao hai tao
 */
public class UserGroupUserDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupUserDao {
    @Override
    public Map<String, Object> findOneByUserGroupUserId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public int generateData(String flagObjectCode) {
//        String findListForUserSqlFilePath = this.getSqlFilePath("findListForUser");
//
//        List<Map<String, Object>> forUserList = this.findList(findListForUserSqlFilePath);
//
//        Map<String, Object> putAll = Maps.newHashMap();
//
//        putAll.put("flagCode", "generate");
//        putAll.put("flagObjectCode", flagObjectCode);
//
//        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");
//
//        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);
//
//        for (Map<String, Object> forUser : forUserList) {
//            forUser.putAll(putAll);
//
//            count += this.save(forUser);
//        }
//
//        return count;

        return 0;
    }

    @Override
    public List<Map<String, Object>> findListByUserId(Map<String, Object> findList) {
        String findListByUserIdSqlFilePath = this.getSqlFilePath("findListByUserId");

        return this.findList(findListByUserIdSqlFilePath, findList);
    }
}