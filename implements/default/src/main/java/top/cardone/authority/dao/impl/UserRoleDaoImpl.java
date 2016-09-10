package top.cardone.authority.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

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
}