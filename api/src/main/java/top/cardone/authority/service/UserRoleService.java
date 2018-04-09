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
 * 用户与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.UserRoleService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface UserRoleService extends PageService {
    /**
     * 查询用户与角色对象
     *
     * @param findOne 用户与角色标识
     * @return 用户与角色对象
     */
    Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne);

    /**
     * 查询用户与角色对象
     *
     * @param findOne 用户与角色标识
     * @return 用户与角色对象
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneByUserRoleIdCache(Map<String, Object> findOne) {
        return this.findOneByUserRoleId(findOne);
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

    /**
     * 读取角色集合
     *
     * @param userCode 用户编号
     * @return
     */
    List<String> readListRoleCodeByUserCode(String userCode);

    /**
     * 读取角色集合
     *
     * @param userCode 用户编号
     * @return
     */
    @Cacheable(key = Caches.KEY_1)
    default List<String> readListRoleCodeByUserCodeCache(String userCode) {
        return this.readListRoleCodeByUserCode(userCode);
    }
}