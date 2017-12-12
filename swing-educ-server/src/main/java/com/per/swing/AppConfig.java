package com.per.swing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class AppConfig {

    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory(){
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("persons");
        return factoryBean;
    }
}
