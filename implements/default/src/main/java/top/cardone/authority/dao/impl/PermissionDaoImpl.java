package top.cardone.authority.dao.impl;

import com.google.common.collect.Maps;
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
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        String sqlFilePath = this.getSqlFilePath("selectPermissionCodeByUserCode");

        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.readList(String.class, sqlFilePath, readList);
    }
}