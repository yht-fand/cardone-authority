package top.cardone.authority.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 令牌信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.TokenInfoService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface TokenInfoService extends PageService {
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
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneByTokenInfoIdCache(Map<String, Object> findOne) {
        return this.findOneByTokenInfoId(findOne);
    }
}