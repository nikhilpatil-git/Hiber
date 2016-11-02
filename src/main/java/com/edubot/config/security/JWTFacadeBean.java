package com.edubot.config.security;

import com.edubot.facades.JWTFacade;
import com.edubot.facades.impl.JWTFacadeImpl;
import com.edubot.services.JWTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JWTServiceBean.class})
public class JWTFacadeBean {

    @Autowired
    JWTService jwtService;

    @Bean
    public JWTFacade jwtFacade(){
        return new JWTFacadeImpl();
    }
}
