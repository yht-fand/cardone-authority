package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户组服务
 *
 * @author yao hai tao
 */
public interface UserGroupService extends PageService {
    /**
     * @see top.cardone.authority.service.UserGroupService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.UserGroupService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.UserGroupService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.UserGroupService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.UserGroupService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.UserGroupService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.UserGroupService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.UserGroupService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.UserGroupService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.UserGroupService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.UserGroupService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.UserGroupService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.UserGroupService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserGroupService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserGroupService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserGroupService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserGroupService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.UserGroupService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.UserGroupService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int saveCache(Object save);

    /**
     * @see top.cardone.authority.service.UserGroupService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.UserGroupService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.authority.service.UserGroupService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int[][] saveListCache(List<Object> saveList);

    /**
     * 查询用户组对象
     *
     * @param findOne 用户组标识
     * @return 用户组对象
     */
    Map<String, Object> findOneByUserGroupId(Map<String, Object> findOne);

    /**
     * 查询用户组下拉列表
     *
     * @param findList 关键字
     * @return 用户组下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateUserGroupTreeAction")})
    int generateData(String flagObjectCode);
}