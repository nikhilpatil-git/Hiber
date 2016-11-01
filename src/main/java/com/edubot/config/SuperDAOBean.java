package com.edubot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceBean.class})
public class SuperDAOBean {

    @Autowired
    DataSourceBean dataSourceBean;


}
