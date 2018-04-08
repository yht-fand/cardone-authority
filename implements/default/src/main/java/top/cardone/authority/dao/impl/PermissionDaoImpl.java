package top.cardone.authority.dao.impl;

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
    public Map<String, Object> findOneByPermissionId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        String findListForTreeSqlFilePath = this.getSqlFilePath("findListForTree");

        return this.findList(findListForTreeSqlFilePath, this.toMap(findList, "select"));
    }

    @Override
    public int generateData(String flagObjectCode) {
        Map<String, Object> generateSqlMap = this.getConfigTable().row("generateSql");

        if (MapUtils.isEmpty(generateSqlMap)) {
            return 0;
        }

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        int count = this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        for (Map.Entry<String, Object> generateSqlEntry : generateSqlMap.entrySet()) {
            Map<String, Object> findList = Maps.newHashMap();

            String findListForGenerateSqlFilePath = this.getSqlFilePath((String) generateSqlEntry.getValue());

            List<Map<String, Object>> generateList = this.findList(findListForGenerateSqlFilePath, findList);

            if (CollectionUtils.isEmpty(generateList)) {
                continue;
            }

            for (Map<String, Object> generate : generateList) {
                generate.putAll(putAll);

                count += this.save(generate);
            }
        }

        return count;
    }
}