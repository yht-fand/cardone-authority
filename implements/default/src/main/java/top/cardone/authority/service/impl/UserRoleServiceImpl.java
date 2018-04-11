package top.cardone.authority.service.impl;

import com.google.common.collect.Maps;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import top.cardone.authority.dao.UserRoleDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserRoleServiceImpl extends PageServiceImpl<UserRoleDao> implements top.cardone.authority.service.UserRoleService {
    @Setter
    private String defaultRoleCode = "general";

    @Override
    public Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne) {
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
    public List<String> readListRoleCodeByUserCode(String userCode) {
        Map<String, Object> readList = Maps.newHashMap();

        readList.put("userCode", userCode);

        List<String> roleCodeList = this.dao.readListBySqlFileName(String.class, "readListRoleCodeByUserCode", readList);

        if (CollectionUtils.isEmpty(roleCodeList)) {
            roleCodeList.add(defaultRoleCode);
        }

        return roleCodeList;
    }
}