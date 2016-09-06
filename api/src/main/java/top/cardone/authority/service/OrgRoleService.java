package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 组织与角色服务
 *
 * @author yao hai tao
 */
public interface OrgRoleService extends PageService {
	/**
     * @see top.cardone.authority.service.OrgRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.OrgRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.OrgRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.OrgRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.OrgRoleService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.OrgRoleService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.OrgRoleService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.OrgRoleService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.OrgRoleService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.OrgRoleService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.OrgRoleService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OrgRoleService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.OrgRoleService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.OrgRoleService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.OrgRoleService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.authority.service.OrgRoleService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.OrgRoleService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询组织与角色对象
     *
     * @param orgRoleId 组织与角色标识
     * @return 组织与角色对象
     */
    Map<String, Object> findOneByOrgRoleId(Object orgRoleId);
}