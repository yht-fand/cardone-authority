package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.shiro.util.StringUtils;
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
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        String findListSqlFilePath = this.getSqlFilePath("findListForTree");

        return this.findList(findListSqlFilePath, findList);
    }

    @Override
    public int generateData(String flagObjectCode) {
        Map<String, String> generateSqlMap = this.configTable.row("generateSql");

        if (MapUtils.isEmpty(generateSqlMap)) {
            return 0;
        }

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = 0;

        for (Map.Entry<String, String> generateSqlEntry : generateSqlMap.entrySet()) {
            Map<String, Object> findList = Maps.newHashMap();

            String findListForGenerateSqlFilePath = this.getSqlFilePath(generateSqlEntry.getValue());

            List<Map<String, Object>> generateList = this.findList(findListForGenerateSqlFilePath, findList);

            if (CollectionUtils.isEmpty(generateList)) {
                continue;
            }

            for (Map<String, Object> generate : generateList) {
                generate.putAll(putAll);

                count += this.insert(generate);
            }
        }

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}