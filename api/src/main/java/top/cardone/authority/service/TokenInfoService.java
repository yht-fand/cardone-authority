package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 令牌信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.TokenInfoService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class, configs = {"insertOperateLogAction"}),
        @Event(applicationEvent = SimpleEvent.class, configs = {"insertOperateLogAction"})})
public interface TokenInfoService extends PageService {
    /**
     * @see top.cardone.authority.service.TokenInfoService#page
     */
    @Cacheable(key = Caches.KEY_1)
    default Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#page
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#findList
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#findOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#readList
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#readOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#delete
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteCache(Object delete) {
        return this.delete(delete);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteAll
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteAllCache() {
        return this.deleteAll();
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteByIds
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#deleteList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#findList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#findOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#insert
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertCache(Object insert) {
        return this.insert(insert);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#insertListByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#readList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#readOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#save
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int saveCache(Object save) {
        return this.save(save);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#update
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int updateCache(Object update) {
        return this.update(update);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#updateList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    /**
     * @see top.cardone.authority.service.TokenInfoService#saveList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[][] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }

    /**
     * 查询令牌信息对象
     *
     * @param findOne 令牌信息标识
     * @return 令牌信息对象
     */
    Map<String, Object> findOneByTokenInfoId(Map<String, Object> findOne);

    /**
     * 查询令牌信息对象
     *
     * @param findOne 令牌信息标识
     * @return 令牌信息对象
     */
    default Map<String, Object> findOneByTokenInfoIdCache(Map<String, Object> findOne) {
        return this.findOneByTokenInfoId(findOne);
    }

    /**
     * 查询令牌信息下拉列表
     *
     * @param findList 关键字
     * @return 令牌信息下拉列表
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByKeywordCache(Map<String, Object> findList) {
        return this.findListByKeyword(findList);
    }
}