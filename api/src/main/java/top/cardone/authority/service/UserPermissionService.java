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
 * 用户与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.UserPermissionService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface UserPermissionService extends PageService {
    /**
     * 查询用户与许可对象
     *
     * @param findOne 用户与许可标识
     * @return 用户与许可对象
     */
    Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne);

    /**
     * 查询用户与许可对象
     *
     * @param findOne 用户与许可标识
     * @return 用户与许可对象
     */
    @Cacheable
    default Map<String, Object> findOneByUserPermissionIdCache(Map<String, Object> findOne) {
        return this.findOneByUserPermissionId(findOne);
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
     * @return
     */
    @CacheEvict(allEntries = true)
    @Transactional
    void generateDataByUserId(String userId);

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(allEntries = true)
    @Transactional
    void generateDataByUserCode(String userCode);

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
     * 读取许可集合
     *
     * @param userCode 用户编号
     * @return
     */
    List<String> readListPermissionCodeByUserCode(String userCode);

    @Cacheable
    default List<String> readListPermissionCodeByUserCodeCache(String userCode) {
        return this.readListPermissionCodeByUserCode(userCode);
    }

    @Cacheable
    default List<String> readListPermissionCodeByPermissionCache(String userCode, String permission) {
        return this.readListPermissionCodeByPermission(userCode, permission);
    }

    List<String> readListPermissionCodeByPermission(String userCode, String permission);
}