package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 用户与角色
 *
 * @author yao hai tao
 */
public interface UserRoleDao extends PageDao {
	int deleteByUserCodes(Map<String,Object> delete);
}