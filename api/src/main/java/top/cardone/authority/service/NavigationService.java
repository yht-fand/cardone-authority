package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
public interface NavigationService extends PageService {
    /**
     * @see top.cardone.authority.service.NavigationService#page
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.NavigationService#page
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.NavigationService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.NavigationService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.NavigationService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.NavigationService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.NavigationService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.NavigationService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.NavigationService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.NavigationService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.NavigationService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.NavigationService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.NavigationService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.NavigationService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.NavigationService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.NavigationService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.NavigationService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.NavigationService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.NavigationService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.NavigationService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.authority.service.NavigationService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.NavigationService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.NavigationService", allEntries = true)
    int[] updateListCache(List<Object> updateList);
}