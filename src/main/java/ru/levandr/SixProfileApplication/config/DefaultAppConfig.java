package ru.levandr.SixProfileApplication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("ru.levandr.SixProfileApplication")
@Configuration
@PropertySource("classpath:application.properties")
public class DefaultAppConfig {

}
