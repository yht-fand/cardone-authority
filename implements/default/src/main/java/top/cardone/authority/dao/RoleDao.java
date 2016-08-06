package top.cardone.authority.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;

/**
 * 角色
 *
 * @author yao hai tao
 */
public interface RoleDao extends PageDao {
    List<String> readListRoleCodeByUserCode(String userCode);
}