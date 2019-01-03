package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 角色
 *
 * @author yao hai tao
 */
public class RoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.RoleDao {
    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = this.updateBySqlFileName("deleteOtherByFlagObjectCode", putAll);

        return count;
    }
}