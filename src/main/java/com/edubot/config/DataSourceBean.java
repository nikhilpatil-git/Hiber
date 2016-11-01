package com.edubot.config;

import com.edubot.util.HibernateUtil;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceBean {

    @Bean
    public SessionFactory sessionFactory(){

        return HibernateUtil.getSessionFactory();
    }

}
