package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 用户组
 *
 * @author yao hai tao
 */
public interface UserGroupDao extends PageDao {
    /**
     * 查询用户组对象
     *
     * @param findOne 用户组标识
     * @return 用户组对象
     */
    Map<String, Object> findOneByUserGroupId(Map<String, Object> findOne);

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}