package com.edubot.config.security;

import com.edubot.checkpoint.SecurityCheckpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SecurityFacadeBean.class)
public class SecurityCheckpointBean {

    @Autowired
    SecurityFacadeBean securityFacadeBean;

    @Bean
    public SecurityCheckpoint securityCheckpoint(){
        return new SecurityCheckpoint();
    }
}
