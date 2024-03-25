package ru.levandr.SixProfileApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import ru.levandr.SixProfileApplication.EnvPrinter.EnvPrinter;
import ru.levandr.SixProfileApplication.EnvPrinter.ProdEnvPrinter;

@Configuration
@PropertySource("classpath:application-prod.properties")
@Profile("prod")
public class ProdAppConfig {
    @Bean
    public EnvPrinter envPrinter() {
        return new ProdEnvPrinter();
    }
}
