package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色
 *
 * @author yao hai tao
 */
public interface UserRoleDao extends PageDao {
	/**
	 * 查询用户与角色对象
	 *
	 * @param findOne 用户与角色标识
	 * @return 用户与角色对象
	 */
	Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne);

	/**
	 * 生成
	 *
	 * @param flagObjectCode 标识对象编号
	 * @return
	 */
	int generateData(String flagObjectCode);

	/**
	 * 读取角色集合
	 *
	 * @param userCode 用户编号
	 * @return
	 */
	List<String> readListRoleCodeByUserCode(String userCode);
}