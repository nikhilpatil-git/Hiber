package com.edubot.config;

import com.edubot.daos.StudentDAO;
import com.edubot.daos.impl.StudentDAOImpl;
import com.edubot.services.StudentService;
import com.edubot.services.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceBean.class})
public class StudentBean {

    @Autowired
    DataSourceBean dataSourceBean;

    @Bean
    public StudentDAO studentDAO(){
        return new StudentDAOImpl();
    }

    @Bean
    public StudentService studentService(){
        return new StudentServiceImpl();
    }
}
