package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息服务
 *
 * @author yao hai tao
 */
public interface TokenInfoService extends PageService {
    /**
     * @see top.cardone.authority.service.TokenInfoService#page
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.TokenInfoService#page
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.TokenInfoService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.TokenInfoService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.TokenInfoService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.TokenInfoService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.TokenInfoService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.TokenInfoService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.TokenInfoService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.authority.service.TokenInfoService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.TokenInfoService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.TokenInfoService", allEntries = true)
    int[] updateListCache(List<Object> updateList);
}