package top.cardone.authority.service.impl;

import org.apache.shiro.SecurityUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserPermissionDao;
import top.cardone.authority.service.UserGroupService;
import top.cardone.cache.Caches;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 用户与许可服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserPermissionServiceImpl extends PageServiceImpl<UserPermissionDao> implements top.cardone.authority.service.UserPermissionService {
    @Override
    public Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    @Override
    public <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    @Override
    public <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    @Override
    public <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    @Override
    public <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    @Override
    public <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    @Override
    @Transactional
    public int deleteCache(Object delete) {
        return this.delete(delete);
    }

    @Override
    @Transactional
    public int deleteAllCache() {
        return this.deleteAll();
    }

    @Override
    @Transactional
    public int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    @Override
    @Transactional
    public int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    @Override
    public List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    @Override
    public Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    @Override
    @Transactional
    public int insertCache(Object insert) {
        return this.insert(insert);
    }

    @Override
    @Transactional
    public int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    @Override
    @Transactional
    public int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    @Override
    @Transactional
    public int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    @Override
    public List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    @Override
    public Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    @Override
    @Transactional
    public Integer saveCache(Object save) {
        return this.save(save);
    }

    @Override
    @Transactional
    public int updateCache(Object update) {
        return this.update(update);
    }

    @Override
    @Transactional
    public int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    @Override
    @Transactional
    public int[][] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }

    @Override
    public Map<String, Object> findOneByUserPermissionId(Map<String, Object> findOne) {
        return this.dao.findOneByUserPermissionId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        return this.dao.findListByKeyword(findList);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserPermissionService.init");

        return this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListPermissionCodeByUserCode(String userCode) {
        return this.dao.readListPermissionCodeByUserCode(userCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String userCode, String functionCode) {
        if (StringUtils.isBlank(userCode)) {
            userCode = (String) SecurityUtils.getSubject().getPrincipal();
        }

        return this.dao.findOneByFunctionCode(userCode, functionCode);
    }

    @Override
    public Map<String, Object> findOneByFunctionCode(String functionCode) {
        return this.findOneByFunctionCode(null, functionCode);
    }

    @Override
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_2)
    public Map<String, Object> findOneByFunctionCodeCache(String userCode, String functionCode) {
        Map<String, Object> map = this.findOneByFunctionCode(userCode, functionCode);

        for (Map.Entry<String, Object> mapEntry : map.entrySet()) {
            if (StringUtils.contains((String) mapEntry.getValue(), "*")) {
                mapEntry.setValue(StringUtils.EMPTY);
            }
        }

        return map;
    }

    @Override
    @Cacheable(value = "top.cardone.authority.service.UserPermissionService", key = Caches.KEY_1)
    public Map<String, Object> findOneByFunctionCodeCache(String functionCode) {
        return this.findOneByFunctionCode(functionCode);
    }
}