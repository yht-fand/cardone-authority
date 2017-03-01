package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 用户与许可服务
 *
 * @author yao hai tao
 */
public interface UserPermissionService extends PageService {
    /**
     * @see top.cardone.authority.service.UserPermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.authority.service.UserPermissionService#page
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.authority.service.UserPermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.authority.service.UserPermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.authority.service.UserPermissionService#delete
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.authority.service.UserPermissionService#deleteAll
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.authority.service.UserPermissionService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.authority.service.UserPermissionService#deleteList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#findList
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#findOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.authority.service.UserPermissionService#insert
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserPermissionService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.authority.service.UserPermissionService#insertList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#readList
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#readOne
     */
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.authority.service.UserPermissionService#save
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.authority.service.UserPermissionService#update
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.authority.service.UserPermissionService#updateList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.authority.service.UserPermissionService#saveList
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);

    /**
     * 查询用户与许可对象
     *
     * @param findOne 用户与许可标识
     * @return 用户与许可对象
     */
    Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne);

    /**
     * 查询用户与许可下拉列表
     *
     * @param findList 关键字
     * @return 用户与许可下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(value = "top.cardone.authority.service.UserPermissionService", allEntries = true)
    int generateData(String flagObjectCode);

    /**
     * 读取许可集合
     *
     * @param userCode 用户编号
     * @return
     */
    List<String> readListPermissionCodeByUserCode(String userCode);


    @Cacheable(value = "cn.com.superstring.rdmp.authority.service.UserPermissionService", key = Caches.KEY_2)
    Map<String, Object> findOneByFunctionCodeCache(String userCode, String functionCode);

    @Cacheable(value = "cn.com.superstring.rdmp.authority.service.UserPermissionService", key = Caches.KEY_1)
    Map<String, Object> findOneByFunctionCodeCache(String functionCode);

    Map<String, Object> findOneByFunctionCode(String userCode, String functionCode);

    Map<String, Object> findOneByFunctionCode(String functionCode);
}