package com.edubot.config.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;


@Configuration
public class JRedisConnectionBean {

    @Bean
    JedisConnectionFactory jedisConnectionFactory(){
        return new JedisConnectionFactory();
    }
}