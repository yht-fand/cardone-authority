package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.val;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 用户组与许可
 *
 * @author yao hai tao
 */
public class UserGroupPermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserGroupPermissionDao {
    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        val saveLists = Lists.newArrayList();

        int count = this.executeQueryBySqlFileName("findListForRolePermission", null, mapOfColumnValues -> {
            mapOfColumnValues.putAll(putAll);

            saveLists.add(mapOfColumnValues);

            if (saveLists.size() > 500) {
                this.saveListOnConflict(saveLists);

                saveLists.clear();
            }
        });

        if (!saveLists.isEmpty()) {
            this.saveListOnConflict(saveLists);

            saveLists.clear();
        }

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}