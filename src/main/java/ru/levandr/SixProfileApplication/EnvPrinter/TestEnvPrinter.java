package ru.levandr.SixProfileApplication.EnvPrinter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;


@Profile("test")
public class TestEnvPrinter implements EnvPrinter {

    @Value("${app.env}")
    private String env;

    @Override
    public void printEnv() {

        System.out.println("TestEnvPrinter is created");
        System.out.println("Env is: " + env);
    }
}
