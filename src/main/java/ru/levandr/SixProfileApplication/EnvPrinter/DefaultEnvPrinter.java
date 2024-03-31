package ru.levandr.SixProfileApplication.EnvPrinter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultEnvPrinter implements EnvPrinter {

    @Value("${spring.profiles.active}")
    private String env;


    @Override
    public void printEnv() {
        System.out.println("DefaultEnvPrinter is created");
        System.out.println("DefaultEnvPrinter env is: " + env);
    }

    @Override
    public void printMegaInfo() {

    }
}
