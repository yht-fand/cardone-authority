package top.cardone.authority.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserRoleDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserRoleServiceImpl extends PageServiceImpl<UserRoleDao> implements top.cardone.authority.service.UserRoleService {
    @Override
    public Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne) {
        return this.dao.findOneByUserRoleId(findOne);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserRoleService.init");

        return this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListRoleCodeByUserCode(String userCode) {
        return this.dao.readListRoleCodeByUserCode(userCode);
    }
}