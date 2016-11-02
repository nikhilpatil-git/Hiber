package com.edubot.config.security;

import com.edubot.services.impl.SecurityService;
import com.edubot.services.impl.SecurityServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityBean {

    @Bean
    public SecurityService securityService(){
        return new SecurityServiceImpl();
    }
}
