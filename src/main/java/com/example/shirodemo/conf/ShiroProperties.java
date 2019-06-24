package com.example.shirodemo.conf;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 13:35
 * @Description: 从配置文件中读取属性值
 */
@Component
@ConfigurationProperties(prefix = "hayek.shiro")
@Data
public class ShiroProperties {

    private String expireIn;

    private long sessionTimeout;

    private int cookieTimeout;

    private String anonUrl;

    private String loginUrl;

    private String successUrl;

    private String logoutUrl;

    private String unauthorizedUrl;

    private String sessionIdName;





}
