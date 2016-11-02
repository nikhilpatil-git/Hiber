package com.edubot.config.security;

import com.edubot.services.JWTService;
import com.edubot.services.impl.JWTServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JWTServiceBean {

    @Bean
    public JWTService jwtService(){
        return new JWTServiceImpl();
    }
}
