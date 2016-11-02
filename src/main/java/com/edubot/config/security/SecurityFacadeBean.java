package com.edubot.config.security;

import com.edubot.config.redis.RedisFacadeBean;
import com.edubot.facades.JWTFacade;
import com.edubot.facades.RedisFacade;
import com.edubot.facades.SecurityFacade;
import com.edubot.facades.impl.SecurityFacadeImpl;
import com.edubot.services.impl.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SecurityBean.class, RedisFacadeBean.class, JWTFacadeBean.class})
public class SecurityFacadeBean {

    @Autowired
    JWTFacade jwtFacade;

    @Autowired
    SecurityService securityService;

    @Autowired
    RedisFacade redisFacade;

    @Bean
    public SecurityFacade securityFacade(){
        return new SecurityFacadeImpl();
    }
}
