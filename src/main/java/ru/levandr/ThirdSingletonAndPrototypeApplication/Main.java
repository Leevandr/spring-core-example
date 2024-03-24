package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Main call");
        applicationContext.getBean(MathAlgorithm.class);
    }
}
