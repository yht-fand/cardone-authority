package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.RoleService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface RoleService extends PageService {
    /**
     * 查询角色对象
     *
     * @param findOne 角色标识
     * @return 角色对象
     */
    Map<String, Object> findOneByRoleId(Map<String, Object> findOne);

    /**
     * 查询角色对象
     *
     * @param findOne 角色标识
     * @return 角色对象
     */
    @Cacheable
    default Map<String, Object> findOneByRoleIdCache(Map<String, Object> findOne) {
        return this.findOneByRoleId(findOne);
    }

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    @Cacheable
    default List<Map<String, Object>> findListForTreeCache(Map<String, Object> findList) {
        return this.findListForTree(findList);
    }

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(allEntries = true)
    @Transactional
    void generateData();

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