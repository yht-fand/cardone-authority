package top.cardone.authority.dao.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.val;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.support.JdbcUtils;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;
import top.cardone.data.jdbc.support.NamedParameterJdbcOperationsSupport;

import java.sql.ResultSet;
import java.util.Map;

/**
 * 用户与角色
 *
 * @author yao hai tao
 */
public class UserRoleDaoImpl extends PageDaoImpl implements top.cardone.authority.dao.UserRoleDao {
    @Override
    public int generateData(String flagObjectCode, String userId, String userCode) {
        String findListForUserGroupRoleSqlFilePath = this.getSqlFilePath("findListForUserGroupRole");

        Map<String, Object> paramMap = Maps.newHashMap();

        paramMap.put("userId", userId);
        paramMap.put("userCode", userCode);

        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        val saveLists = Lists.newArrayList();

        int count = this.execute(findListForUserGroupRoleSqlFilePath, paramMap, mapOfColumnValues -> {
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

        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        paramMap.putAll(putAll);

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, paramMap);

        return count;
    }
}