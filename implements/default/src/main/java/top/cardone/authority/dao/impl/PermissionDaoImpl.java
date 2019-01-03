package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.val;
import org.apache.commons.collections.MapUtils;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 许可
 *
 * @author yao hai tao
 */
public class PermissionDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.PermissionDao {
    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> generateSqlMap = this.getConfigTable().row("generateSql");

        if (MapUtils.isEmpty(generateSqlMap)) {
            return 0;
        }

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = 0;

        for (Map.Entry<String, Object> generateSqlEntry : generateSqlMap.entrySet()) {
            val saveLists = Lists.newArrayList();

            count += this.executeQueryBySqlFileName((String) generateSqlEntry.getValue(), null, mapOfColumnValues -> {
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
        }

        count += this.updateBySqlFileName("deleteOtherByFlagObjectCode", putAll);

        return count;
    }
}