package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.math.NumberUtils;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户
 *
 * @author yao hai tao
 */
public class UserGroupUserDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupUserDao {
    @Override
    public int generateData(String flagObjectCode) {
        String findListForUserSqlFilePath = this.getSqlFilePath("findListForUser");

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = this.execute(findListForUserSqlFilePath, Maps.newHashMap(), mapOfColumnValues -> {
            mapOfColumnValues.putAll(putAll);

            this.saveOnConflict(mapOfColumnValues);
        });

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}