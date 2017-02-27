package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 许可
 *
 * @author yao hai tao
 */
public class PermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.PermissionDao {
    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        String sqlFilePath = this.getSqlFilePath("selectPermissionCodeByUserCode");

        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.readList(String.class, sqlFilePath, readList);
    }

    @Override
    public Map<String, Object> findOneByPermissionId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        String findListSqlFilePath = this.getSqlFilePath("findListForTree");

        return this.findList(findListSqlFilePath, findList);
    }

    @Override
    public int generateData(String flagObjectCode) {
//        String findListForDepartmentSqlFilePath = this.getSqlFilePath("findListForDepartment");
//
//        List<Map<String, Object>> forDepartmentList = this.findList(findListForDepartmentSqlFilePath);
//
//        Map<String, Object> putAll = Maps.newHashMap();
//
//        putAll.put("flagCode", "generateForDepartment");
//        putAll.put("flagObjectCode", flagObjectCode);

        int count = 0;
//
//        for (Map<String, Object> forDepartment : forDepartmentList) {
//            forDepartment.putAll(putAll);
//
//            count += this.insert(forDepartment);
//        }
//
//        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");
//
//        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}