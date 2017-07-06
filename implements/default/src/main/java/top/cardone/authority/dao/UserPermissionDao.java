package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 用户与许可
 *
 * @author yao hai tao
 */
public interface UserPermissionDao extends PageDao {
    /**
     * 查询用户与许可对象
     *
     * @param findOne 用户与许可标识
     * @return 用户与许可对象
     */
    Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);

    /**
     * 读取许可集合
     *
     * @param userCode 用户编号
     * @return
     */
    List<String> readListPermissionCodeByUserCode(String userCode);

    Map<String, Object> findOneByFunctionCode(String userCode, String functionCode);
}