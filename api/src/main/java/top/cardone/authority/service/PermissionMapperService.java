package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 许可映射服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.PermissionMapperService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface PermissionMapperService extends PageService {

    /**
     * 查询许可映射对象
     *
     * @param findOne 许可映射标识
     * @return 许可映射对象
     */
    Map<String, Object> findOneByPermissionMapperId(Map<String, Object> findOne);
	
    /**
     * 查询许可映射对象
     *
     * @param findOne 许可映射标识
     * @return 许可映射对象
     */
    @Cacheable
    default Map<String, Object> findOneByPermissionMapperIdCache(Map<String, Object> findOne) {
        return this.findOneByPermissionMapperId(findOne);
    }
}