package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        ObjectFactoryHolder factoryHolder = applicationContext.getBean(ObjectFactoryHolder.class);

        factoryHolder.getPrototype().printCreatedTime();
        factoryHolder.getSingleton().printCreatedTime();

        System.out.println("-----------------");

        System.out.println(factoryHolder.getPrototype() == factoryHolder.getPrototype());

        System.out.println(factoryHolder.getSingleton() == factoryHolder.getSingleton());

    }
}
