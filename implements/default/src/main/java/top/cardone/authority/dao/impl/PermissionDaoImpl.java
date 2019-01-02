package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
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
            String findListForGenerateSqlFilePath = this.getSqlFilePath((String) generateSqlEntry.getValue());

            count += this.execute(findListForGenerateSqlFilePath, Maps.newHashMap(), mapOfColumnValues -> {
                mapOfColumnValues.putAll(putAll);

                this.saveOnConflict(mapOfColumnValues);
            });
        }

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}