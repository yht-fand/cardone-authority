package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户
 *
 * @author yao hai tao
 */
public interface UserGroupUserDao extends PageDao {
    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);

    /**
     * 用户标识查询
     *
     * @param findList
     * @return
     */
    List<Map<String, Object>> findListByUserId(Map<String, Object> findList);
}