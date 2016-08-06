package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;

/**
 * 许可
 *
 * @author yao hai tao
 */
public interface PermissionDao extends PageDao {
    List<String> readListPermissionCodeByUserCode(String userCode);
}