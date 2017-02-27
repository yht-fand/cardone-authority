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
	int deleteByUserCodes(Map<String,Object> delete);

	Map<String, Object> findOneByUserCode(Map<String,Object> findOne);

	/**
	 * 查询用户与角色对象
	 *
	 * @param findOne 用户与角色标识
	 * @return 用户与角色对象
	 */
	Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne);

	/**
	 * 查询角色下拉列表
	 *
	 * @param findList 关键字
	 * @return 用户与角色下拉列表
	 */
	List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

	/**
	 * 生成
	 *
	 * @param flagObjectCode 标识对象编号
	 * @return
	 */
	int generateData(String flagObjectCode);
}