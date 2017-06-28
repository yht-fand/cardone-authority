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
public interface OAuthConsumerService extends PageService {
    /**
     * @see top.cardone.authority.service.OAuthConsumerService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#page
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.OAuthConsumerService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int saveCache(Object save);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.authority.service.OAuthConsumerService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.OAuthConsumerService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);

    /**
     * 查询授权消费对象
     *
     * @param findOne 授权消费标识
     * @return 授权消费对象
     */
    Map<String, Object> findOneByOAuthConsumerId(Map<String, Object> findOne);

    /**
     * 查询授权消费下拉列表
     *
     * @param findList 关键字
     * @return 授权消费下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}