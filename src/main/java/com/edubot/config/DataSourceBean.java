package com.edubot.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceBean {

    @Bean
    public Session dataSource(){

        Session session;

        try {
            // Create the SessionFactory from hibernate.cfg.xml
            SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
            session = sessionFactory.getCurrentSession();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        return session;
    }

}
