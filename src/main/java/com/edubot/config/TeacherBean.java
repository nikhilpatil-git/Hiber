package com.edubot.config;

import com.edubot.daos.TeacherDAO;
import com.edubot.daos.impl.TeacherDAOImpl;
import com.edubot.services.TeacherService;
import com.edubot.services.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceBean.class})
public class TeacherBean {

    @Autowired
    DataSourceBean dataSourceBean;

    @Bean
    public TeacherDAO teacherDAO(){
        return new TeacherDAOImpl();
    }

    @Bean
    public TeacherService teacherService(){
        return new TeacherServiceImpl();
    }


}
