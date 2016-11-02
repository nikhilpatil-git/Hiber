package com.edubot.config.redis;

import com.edubot.facades.RedisFacade;
import com.edubot.facades.impl.RedisFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({RedisServiceBean.class})
public class RedisFacadeBean {

    @Autowired
    RedisServiceBean redisServiceBean;

    @Bean
    RedisFacade redisFacade(){
        return new RedisFacadeImpl();
    }
}
