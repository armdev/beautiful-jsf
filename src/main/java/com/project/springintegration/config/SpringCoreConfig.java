package com.project.springintegration.config;

import com.project.springintegration.dao.UserManagementDAO;
import com.project.springintegration.dao.UserManagementDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCoreConfig {

   
    @Bean
    public UserManagementDAO userManagementDAO() {
        return new UserManagementDAOImpl();
    }
}
