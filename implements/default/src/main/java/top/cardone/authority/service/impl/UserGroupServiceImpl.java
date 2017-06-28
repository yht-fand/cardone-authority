package top.cardone.authority.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.UserGroupDao;
import top.cardone.authority.service.*;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户组服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class UserGroupServiceImpl extends PageServiceImpl<UserGroupDao> implements top.cardone.authority.service.UserGroupService {
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
    public int[][] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }

    @Override
    public Map<String, Object> findOneByUserGroupId(Map<String, Object> findOne) {
        return this.dao.findOneByUserGroupId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        return this.dao.findListByKeyword(findList);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListForTree(findList);
    }

    @Override
    @Transactional
    public int generateData() {
        String flagObjectCode = UUID.randomUUID().toString();

        int count = this.generateData(flagObjectCode);

        //用户组与用户
        count += ApplicationContextHolder.getBean(UserGroupUserService.class).generateData(flagObjectCode);

        //角色
        count += ApplicationContextHolder.getBean(RoleService.class).generateData(flagObjectCode);

        //用户组与角色
        count += ApplicationContextHolder.getBean(UserGroupRoleService.class).generateData(flagObjectCode);

        //用户与角色
        count += ApplicationContextHolder.getBean(UserRoleService.class).generateData(flagObjectCode);

        //授权
        count += ApplicationContextHolder.getBean(PermissionService.class).generateData(flagObjectCode);

        //角色与授权
        count += ApplicationContextHolder.getBean(RolePermissionService.class).generateData(flagObjectCode);

        //用户组与授权
        count += ApplicationContextHolder.getBean(UserGroupPermissionService.class).generateData(flagObjectCode);

        //用户与授权
        count += ApplicationContextHolder.getBean(UserPermissionService.class).generateData(flagObjectCode);

        return count;
    }

    @Override
    @Transactional
    public int generateData(String flagObjectCode) {
        ApplicationContextHolder.action(InitDataAction.class, action -> action.action(), "top.cardone.authority.service.UserGroupService.init");

        return this.dao.generateData(flagObjectCode);
    }
}