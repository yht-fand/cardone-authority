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
 * 授权消费服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.authority.service.OAuthConsumerService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface OAuthConsumerService extends PageService {
    /**
     * 查询授权消费对象
     *
     * @param findOne 授权消费标识
     * @return 授权消费对象
     */
    Map<String, Object> findOneByOAuthConsumerId(Map<String, Object> findOne);

    /**
     * 查询授权消费对象
     *
     * @param findOne 授权消费标识
     * @return 授权消费对象
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneByOAuthConsumerIdCache(Map<String, Object> findOne) {
        return this.findOneByOAuthConsumerId(findOne);
    }
}