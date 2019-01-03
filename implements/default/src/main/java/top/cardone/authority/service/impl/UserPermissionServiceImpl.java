package top.cardone.authority.service.impl;

import com.google.common.collect.Maps;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserPermissionServiceImpl extends PageServiceImpl<UserPermissionDao> implements top.cardone.authority.service.UserPermissionService {
    @Override
    public Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public void generateDataByUserId(String userId) {
        this.dao.generateData(UUID.randomUUID().toString(), userId, null);
    }

    @Override
    public void generateDataByUserCode(String userCode) {
        this.dao.generateData(UUID.randomUUID().toString(), null, userCode);
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.executeQueryBySqlFileName("readListUserCode", null, String.class, userCode -> {
            this.dao.generateData(flagObjectCode, null, userCode);
        });
    }

    @Override
    public int generateData(String flagObjectCode, String userId, String userCode) {
        return this.dao.generateData(flagObjectCode, userId, userCode);
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        return this.dao.readListBySqlFileName(String.class, "readListPermissionCodeByUserCode", readList);
    }

    @Override
    public List<String> readListPermissionCodeByPermission(String userCode, String permission) {
        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);
        readList.put("permission", permission);

        return this.dao.readListBySqlFileName(String.class, "readListPermissionCodeByPermission", readList);
    }
}