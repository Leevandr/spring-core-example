package ru.levandr.FourLifeCycleBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.levandr.FourLifeCycleBean")
public class AppConfig {
    @Bean
    public SimpleBean simpleBean(){
        return new SimpleBean();
    }
}
