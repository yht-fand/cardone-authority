package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.val;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 用户组与用户
 *
 * @author yao hai tao
 */
public class UserGroupUserDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupUserDao {
    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        val saveLists = Lists.newArrayList();

        int count = this.executeQueryBySqlFileName("findListForUser", null, mapOfColumnValues -> {
            mapOfColumnValues.putAll(putAll);

            saveLists.add(mapOfColumnValues);

            if (saveLists.size() > 100) {
                this.saveListOnConflict(saveLists);

                saveLists.clear();
            }
        });

        if (!saveLists.isEmpty()) {
            this.saveListOnConflict(saveLists);

            saveLists.clear();
        }

        count += this.updateBySqlFileName("deleteOtherByFlagObjectCode", putAll);

        return count;
    }
}