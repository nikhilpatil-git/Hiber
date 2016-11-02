package com.edubot.config.redis;

import com.edubot.services.RedisService;
import com.edubot.services.impl.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({RedisBean.class})
public class RedisServiceBean {

    @Autowired
    RedisBean redisBean;

    @Bean
    RedisService redisService(){
        return new RedisServiceImpl();
    }
}
