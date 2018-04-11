package top.cardone.authority.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.authority.dao.TokenInfoDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 令牌信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class TokenInfoServiceImpl extends PageServiceImpl<TokenInfoDao> implements top.cardone.authority.service.TokenInfoService {
    @Override
    public Map<String, Object> findOneByTokenInfoId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }
}