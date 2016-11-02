package com.edubot.config.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.RedisTemplate;


@Configuration
@Import({JRedisConnectionBean.class})
public class RedisBean {

    @Autowired
    JRedisConnectionBean jRedisConnectionBean;

    @Bean
    RedisTemplate redisTemplate() {

        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jRedisConnectionBean.jedisConnectionFactory());
        return redisTemplate;
    }

}
