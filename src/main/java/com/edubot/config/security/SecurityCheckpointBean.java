package com.edubot.config.security;

import com.edubot.checkpoint.SecurityCheckpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityCheckpointBean {

    @Bean
    public SecurityCheckpoint securityCheckpoint(){
        return new SecurityCheckpoint();
    }
}
