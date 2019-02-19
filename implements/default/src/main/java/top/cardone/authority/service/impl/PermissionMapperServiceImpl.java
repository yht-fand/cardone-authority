package top.cardone.authority.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;
import top.cardone.authority.dao.PermissionMapperDao;

import java.util.List;
import java.util.Map;

/**
 * 许可映射服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class PermissionMapperServiceImpl extends PageServiceImpl<PermissionMapperDao> implements top.cardone.authority.service.PermissionMapperService {
    @Override
    public Map<String, Object> findOneByPermissionMapperId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }
}