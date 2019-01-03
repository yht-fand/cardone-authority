package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import lombok.val;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 用户组与许可
 *
 * @author yao hai tao
 */
@Log4j2
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

            if (saveLists.size() > 100) {
                this.saveListOnConflict(saveLists);

                saveLists.clear();

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    log.error(e);
                }
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