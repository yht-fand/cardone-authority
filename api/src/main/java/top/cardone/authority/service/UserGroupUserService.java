package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户组与用户服务
 *
 * @author yao hai tao
 */
public interface UserGroupUserService extends PageService {
	/**
     * @see top.cardone.authority.service.UserGroupUserService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.UserGroupUserService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserGroupUserService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.authority.service.UserGroupUserService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserGroupUserService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询用户组与用户对象
     *
     * @param findOne 用户组与用户标识
     * @return 用户组与用户对象
     */
    Map<String, Object> findOneByUserGroupUserId(Map<String, Object> findOne);
	
    /**
     * 查询用户组与用户下拉列表
     *
     * @param findList 关键字
     * @return 用户组与用户下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}