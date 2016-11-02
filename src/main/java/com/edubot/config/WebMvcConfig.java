package com.edubot.config;

import com.edubot.checkpoint.SecurityCheckpoint;
import com.edubot.config.security.SecurityCheckpointBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by deadcode on 01/11/2016.
 */
@Configuration
@Import(SecurityCheckpointBean.class)
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    SecurityCheckpoint securityCheckpoint;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);

        registry.addInterceptor(securityCheckpoint);
    }
}
