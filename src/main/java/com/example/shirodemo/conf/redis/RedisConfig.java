package com.example.shirodemo.conf.redis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.net.UnknownHostException;

/**
 * @Auther: shiyunkai
 * @Date: 2019/03/27 17:20
 * @Description:
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

    // 当配置了自定义的redis template后默认的RedisTemplate<Object, Object>就不会配置，但是又在其它地方需要用到，所以我们要自己配置
    @Bean(name = "objectRedisTemplate")
    public RedisTemplate<Object, Object> ObjectRedisTemplate(
            RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
