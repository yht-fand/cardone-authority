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
		String findListForUserGroupRoleSqlFilePath = this.getSqlFilePath("findListForUserGroupRole");

		List<Map<String, Object>> forUserGroupRoleList = this.findList(findListForUserGroupRoleSqlFilePath);

		Map<String, Object> putAll = Maps.newHashMap();

		putAll.put("flagCode", "generate");
		putAll.put("flagObjectCode", flagObjectCode);

		int count = 0;

		for (Map<String, Object> forUserGroupRole : forUserGroupRoleList) {
			forUserGroupRole.putAll(putAll);

			count += this.insert(forUserGroupRole);
		}

		String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

		count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

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