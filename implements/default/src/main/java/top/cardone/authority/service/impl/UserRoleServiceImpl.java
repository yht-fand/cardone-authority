package top.cardone.authority.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserRoleDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户与角色服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserRoleServiceImpl extends PageServiceImpl<UserRoleDao> implements top.cardone.authority.service.UserRoleService {
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
    public int saveCache(Object save) {
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
    public int[] insertListByNotExistsForRolesCache(Map<String, Object> insert) {
        return this.insertListByNotExistsForRoles(insert);
    }

    @Override
    @Transactional
    public int[] insertListByNotExistsForRoles(Map<String, Object> insert) {
        String userCode = MapUtils.getString(insert, "userCode");

        Object roleCodes = MapUtils.getObject(insert, "roleCodes");

        List<String> roleCodeList;

        if (roleCodes instanceof String) {
            roleCodeList = Lists.newArrayList((String) roleCodes);
        } else if (roleCodes instanceof List) {
            roleCodeList = (List<String>) roleCodes;
        } else {
            return new int[]{};
        }

        if (CollectionUtils.isEmpty(roleCodeList)) {
            return new int[]{};
        }

        List<Object> insertList = Lists.newArrayList();

        for (String roleCode : roleCodeList) {
            Map<String, Object> newInsert = Maps.newHashMap();

            newInsert.put("userCode", userCode);
            newInsert.put("roleCode", roleCode);

            insertList.add(newInsert);
        }

        return this.insertListByNotExists(insertList);
    }

    @Override
    @Transactional
    public int[] updateListForRolesCache(Map<String, Object> update) {
        return this.updateListForRoles(update);
    }

    @Override
    @Transactional
    public int[] updateListForRoles(Map<String, Object> update) {
        Map<String, Object> delete = Maps.newHashMap();

        delete.put("userCode", update.get("userCode"));

        this.delete(delete);

        return this.insertListByNotExistsForRoles(update);
    }

    @Override
    @Transactional
    public int deleteByUserCodesCache(Map<String, Object> delete) {
        return this.deleteByUserCodes(delete);
    }

    @Override
    @Transactional
    public int deleteByUserCodes(Map<String, Object> delete) {
        return this.dao.deleteByUserCodes(delete);
    }

    @Override
    public Map<String, Object> findOneByUserCode(Map<String, Object> findOne) {
        return this.dao.findOneByUserCode(findOne);
    }

    @Override
    public Map<String, Object> findOneByUserRoleId(Map<String, Object> findOne) {
        return this.dao.findOneByUserRoleId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        return this.findListByKeyword(findList);
    }

    @Override
    @Transactional
    public int generateData() {
        return ApplicationContextHolder.getBean(UserGroupService.class).generateData();
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserRoleService.init");

        return this.dao.generateData(flagObjectCode);
    }

    @Override
    public List<String> readListRoleCodeByUserCode(String userCode) {
        return this.dao.readListRoleCodeByUserCode(userCode);
    }
}