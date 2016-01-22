package top.cardone.authority.dto;

import top.cardone.authority.po.TokenInfo;

/**
 * 令牌信息
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class TokenInfoDto extends TokenInfo {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 130966112498722135L;
}