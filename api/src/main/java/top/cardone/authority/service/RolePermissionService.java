package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 角色与许可服务
 *
 * @author yao hai tao
 */
public interface RolePermissionService extends PageService {
	/**
     * @see top.cardone.authority.service.RolePermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.RolePermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.RolePermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.RolePermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.RolePermissionService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.RolePermissionService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.RolePermissionService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.RolePermissionService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.RolePermissionService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.RolePermissionService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.RolePermissionService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.RolePermissionService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.RolePermissionService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.RolePermissionService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.RolePermissionService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.authority.service.RolePermissionService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.RolePermissionService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询角色与许可对象
     *
     * @param findOne 角色与许可标识
     * @return 角色与许可对象
     */
    Map<String, Object> findOneByRolePermissionId(Map<String, Object> findOne);
	
    /**
     * 查询角色与许可下拉列表
     *
     * @param findList 关键字
     * @return 角色与许可下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}