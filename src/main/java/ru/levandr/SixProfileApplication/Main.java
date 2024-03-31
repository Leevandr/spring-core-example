package ru.levandr.SixProfileApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.levandr.SixProfileApplication.Beans.ProfileWorker;
import ru.levandr.SixProfileApplication.config.DefaultAppConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DefaultAppConfig.class);
        context.getBean(ProfileWorker.class).doWork();

        context.getBean(ProfileWorker.class).doLevHuesos();
    }
}
