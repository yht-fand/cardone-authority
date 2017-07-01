package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.annotation.Func;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 角色服务
 *
 * @author yao hai tao
 */
public interface RoleService extends PageService {
    /**
     * @see top.cardone.authority.service.RoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.RoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.RoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.RoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.RoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.RoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.RoleService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.RoleService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.RoleService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.RoleService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.RoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.RoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.RoleService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.RoleService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.RoleService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.RoleService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.RoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.RoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.RoleService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.RoleService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int saveCache(Object save);

    /**
     * @see top.cardone.authority.service.RoleService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.RoleService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int[] updateListCache(List<Object> updateList);

    /**
     * 查询角色对象
     *
     * @param findOne 角色标识
     * @return 角色对象
     */
    Map<String, Object> findOneByRoleId(Map<String, Object> findOne);

    /**
     * 查询角色下拉列表
     *
     * @param findList 关键字
     * @return 角色下拉列表
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
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.RoleService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, config = "func0BeanName:generateRoleTreeFunc")})
    int generateData(String flagObjectCode);
}