package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户组
 *
 * @author yao hai tao
 */
public class UserGroupDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupDao {
    @Override
    public Map<String, Object> findOneByUserGroupId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        String findListForTreeSqlFilePath = this.getSqlFilePath("findListForTree");

        return this.findList(findListForTreeSqlFilePath, this.toMap(findList, "select"));
    }

    @Override
    public int generateData(String flagObjectCode) {
//        String findListForDepartmentSqlFilePath = this.getSqlFilePath("findListForDepartment");
//
//        List<Map<String, Object>> forDepartmentList = this.findList(findListForDepartmentSqlFilePath);
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
//        for (Map<String, Object> forDepartment : forDepartmentList) {
//            forDepartment.putAll(putAll);
//
//            count += this.save(forDepartment);
//        }
//
//        return count;

        return 0;
    }
}