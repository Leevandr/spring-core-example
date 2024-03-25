package ru.levandr.SixProfileApplication.config;

import org.springframework.context.annotation.*;
import ru.levandr.SixProfileApplication.EnvPrinter.EnvPrinter;
import ru.levandr.SixProfileApplication.EnvPrinter.TestEnvPrinter;

@Configuration
@PropertySources(
        value = @PropertySource("classpath:application-test.properties")
)
@Profile("test")
public class TestAppConfig {
    @Bean
    public EnvPrinter envPrinter() {
        return new TestEnvPrinter();
    }
}
