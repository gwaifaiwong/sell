package com.gwaifaiwong.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Create by
 *
 * @author gwaifaiwong
 * @date 2020/6/29
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    private String mpAppId;
    private String mpAppSecret;
    /**
     * 商户号
     */
    private String mchId;
    /**
     * 商户密钥
     */
    private String mchKey;
    /**
     * 商户证书路径
     */
    private String keyPath;
    /**
     * 微信支付异步通知
     */
    private String notifyUrl;
}
