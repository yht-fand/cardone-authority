package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 授权消费服务
 *
 * @author yao hai tao
 */
public interface OauthConsumerService extends PageService {
	/**
     * @see top.cardone.authority.service.OauthConsumerService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.authority.service.OauthConsumerService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OauthConsumerService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.authority.service.OauthConsumerService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.OauthConsumerService", allEntries = true)
    int[] updateListCache(List<Object> updateList);
}