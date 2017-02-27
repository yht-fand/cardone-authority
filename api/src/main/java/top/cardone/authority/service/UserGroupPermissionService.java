package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户组与许可服务
 *
 * @author yao hai tao
 */
public interface UserGroupPermissionService extends PageService {
    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupPermissionService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.authority.service.UserGroupPermissionService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupPermissionService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);

    /**
     * 查询用户组与许可对象
     *
     * @param findOne 用户组与许可标识
     * @return 用户组与许可对象
     */
    Map<String, Object> findOneByUserGroupPermissionId(Map<String, Object> findOne);

    /**
     * 查询用户组与许可下拉列表
     *
     * @param findList 关键字
     * @return 用户组与许可下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 生成
     *
     * @return
     */
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}