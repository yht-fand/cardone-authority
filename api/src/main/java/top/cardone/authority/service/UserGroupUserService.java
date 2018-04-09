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

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.UserGroupUserService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface UserGroupUserService extends PageService {
    /**
     * 查询用户组与用户对象
     *
     * @param findOne 用户组与用户标识
     * @return 用户组与用户对象
     */
    Map<String, Object> findOneByUserGroupUserId(Map<String, Object> findOne);

    /**
     * 查询用户组与用户对象
     *
     * @param findOne 用户组与用户标识
     * @return 用户组与用户对象
     */
    @Cacheable
    default Map<String, Object> findOneByUserGroupUserIdCache(Map<String, Object> findOne) {
        return this.findOneByUserGroupUserId(findOne);
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
     * 用户标识查询
     *
     * @param findList
     * @return
     */
    List<Map<String, Object>> findListByUserId(Map<String, Object> findList);
}