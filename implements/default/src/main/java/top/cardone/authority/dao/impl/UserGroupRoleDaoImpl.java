package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 用户组与角色
 *
 * @author yao hai tao
 */
public class UserGroupRoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupRoleDao {
    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = this.updateBySqlFileName("deleteOtherByFlagObjectCode", putAll);

        return count;
    }
}