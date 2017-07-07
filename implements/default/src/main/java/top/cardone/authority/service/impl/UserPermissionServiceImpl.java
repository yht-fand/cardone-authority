package top.cardone.authority.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.data.action.InitDataAction;
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
        return this.dao.findOneByUserPermissionId(findOne);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserPermissionService.init");

        return this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        return this.dao.readListPermissionCodeByUserCode(userCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String userCode, String functionCode) {
        if (StringUtils.isBlank(userCode)) {
            userCode = (String) SecurityUtils.getSubject().getPrincipal();
        }

        return this.dao.findOneByFunctionCode(userCode, functionCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String functionCode) {
        return this.findOneByFunctionCode(null, functionCode);
    }
}