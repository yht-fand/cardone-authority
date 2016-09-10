package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户与角色服务
 *
 * @author yao hai tao
 */
public interface UserRoleService extends PageService {
    /**
     * @see top.cardone.authority.service.UserRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.UserRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.UserRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.UserRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.UserRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.UserRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.UserRoleService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.UserRoleService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.UserRoleService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.UserRoleService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.UserRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.UserRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.UserRoleService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserRoleService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserRoleService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserRoleService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.UserRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserRoleService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.UserRoleService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.authority.service.UserRoleService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.UserRoleService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.authority.service.UserRoleService#insertListByNotExistsForRoles
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] insertListByNotExistsForRolesCache(Map<String,Object> insert);

    int[] insertListByNotExistsForRoles(Map<String,Object> insert);

    /**
     * @see top.cardone.authority.service.UserRoleService#updateListForRoles
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int[] updateListForRolesCache(Map<String, Object> update);

    int[] updateListForRoles(Map<String, Object> update);

    /**
     * @see top.cardone.authority.service.UserRoleService#deleteByUserCodes
     */
    @CacheEvict(value = "top.cardone.authority.service.UserRoleService", allEntries = true)
    int deleteByUserCodesCache(Map<String,Object> delete);

    int deleteByUserCodes(Map<String,Object> delete);
}