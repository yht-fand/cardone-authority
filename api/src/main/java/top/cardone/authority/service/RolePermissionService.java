package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 角色与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.RolePermissionService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface RolePermissionService extends PageService {
    /**
     * 查询角色与许可对象
     *
     * @param findOne 角色与许可标识
     * @return 角色与许可对象
     */
    Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne);

    /**
     * 查询角色与许可对象
     *
     * @param findOne 角色与许可标识
     * @return 角色与许可对象
     */
    @Cacheable
    default Map<String, Object> findOneByRolePermissionIdCache(Map<String, Object> findOne) {
        return this.findOneByRolePermissionId(findOne);
    }
    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(allEntries = true)
    @Transactional
    void generateData(String flagObjectCode);
}