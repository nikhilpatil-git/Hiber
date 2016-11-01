package com.edubot.config.facades;

import com.edubot.config.TeacherBean;
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
@Import({TeacherBean.class})
public class TeacherFacadeBean {

    @Autowired
    TeacherBean teacherBean;

    @Bean
    public TeacherFacade teacherFacade(){
        return new TeacherFacadeImpl();
    }

}
