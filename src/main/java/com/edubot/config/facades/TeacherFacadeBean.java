package com.edubot.config.facades;

import com.edubot.config.TeacherBean;
import com.edubot.config.security.SecurityFacadeBean;
import com.edubot.facades.TeacherFacade;
import com.edubot.facades.impl.TeacherFacadeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by deadcode on 01/11/2016.
 */
@Configuration
@Import({TeacherBean.class, SecurityFacadeBean.class})
public class TeacherFacadeBean {

    @Autowired
    TeacherBean teacherBean;

    @Autowired
    SecurityFacadeBean securityFacadeBean;

    @Bean
    public TeacherFacade teacherFacade(){
        return new TeacherFacadeImpl();
    }

}
