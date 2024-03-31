package ru.levandr.SixProfileApplication.EnvPrinter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;


@Profile("prod")
public class ProdEnvPrinter implements EnvPrinter {

    @Value("${spring.profiles.active}")
    private String env;


    @Override
    public void printEnv() {
        System.out.println("ProdEnvPrinter is created");
        System.out.println("Env is: " + env);
    }

    @Override
    public void printMegaInfo() {
        System.out.println("Lev Huesos");
    }


}
