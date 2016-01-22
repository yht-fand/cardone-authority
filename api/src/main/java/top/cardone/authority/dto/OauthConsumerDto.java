package top.cardone.authority.dto;

import top.cardone.authority.po.OauthConsumer;

/**
 * 授权消费
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class OauthConsumerDto extends OauthConsumer {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 533506645015865564L;
}