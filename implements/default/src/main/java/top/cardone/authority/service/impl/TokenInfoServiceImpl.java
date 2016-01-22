package top.cardone.authority.service.impl;

import top.cardone.authority.dao.TokenInfoDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 令牌信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class TokenInfoServiceImpl extends PageServiceImpl<TokenInfoDao> implements top.cardone.authority.service.TokenInfoService {
}