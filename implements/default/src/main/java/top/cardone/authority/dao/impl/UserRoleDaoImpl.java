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
	public int deleteByUserCodes(Map<String,Object> delete) {
		String deleteSqlFilePath = this.getSqlFilePath("deleteByUserCodes");

		return this.update(deleteSqlFilePath, delete);
	}

	@Override
	public Map<String, Object> findOneByUserCode(Map<String,Object> findOne) {
		String findOneSqlFilePath = this.getSqlFilePath("page.find");

		return this.findOne(findOneSqlFilePath,findOne);
	}

	@Override
	public Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne) {
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