package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 部门与角色服务
 *
 * @author yao hai tao
 */
public interface DepartmentRoleService extends PageService {
	/**
     * @see top.cardone.authority.service.DepartmentRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#page
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.DepartmentRoleService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.authority.service.DepartmentRoleService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.DepartmentRoleService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询部门与角色对象
     *
     * @param departmentRoleId 部门与角色标识
     * @return 部门与角色对象
     */
    Map<String, Object> findOneByDepartmentRoleId(Object departmentRoleId);
}