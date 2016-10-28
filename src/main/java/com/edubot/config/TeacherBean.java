package com.edubot.config;

import com.edubot.dao.TeacherDao;
import com.edubot.dao.impl.TeacherDaoImpl;
import com.edubot.helpers.email.TeacherEmailHandler;
import com.edubot.service.TeacherService;
import com.edubot.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceBean.class, SecurityBean.class, EmailSenderBean.class})
public class TeacherBean {

    @Autowired
    DataSourceBean dataSourceBean;

    @Autowired
    SecurityBean securityBean;

    @Autowired
    EmailSenderBean emailSenderBean;

    @Bean
    public TeacherDao teacherDao(){

        return new TeacherDaoImpl(dataSourceBean.dataSource());
    }

    @Bean
    public TeacherEmailHandler teacherEmailHandler(){

        return new TeacherEmailHandler();
    }

    @Bean
    public TeacherService teacherService(){

        return new TeacherServiceImpl();
    }

}
