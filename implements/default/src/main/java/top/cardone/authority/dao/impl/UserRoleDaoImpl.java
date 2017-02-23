package top.cardone.authority.dao.impl;

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
}