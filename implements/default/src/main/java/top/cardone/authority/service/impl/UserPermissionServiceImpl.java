package top.cardone.authority.service.impl;

import com.google.common.collect.Maps;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

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
    @Transactional
    public void generateData() {
        ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
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