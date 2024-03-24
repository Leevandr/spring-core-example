package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        FirstSingleton singleton1 = applicationContext.getBean(FirstSingleton.class);
        FirstSingleton singleton2 = applicationContext.getBean(FirstSingleton.class);
        System.out.println(singleton2 == singleton1);

        PrototypeComponent prototypeComponent1 = applicationContext.getBean(PrototypeComponent.class);
        PrototypeComponent prototypeComponent2 = applicationContext.getBean(PrototypeComponent.class);

        System.out.println(prototypeComponent1 == prototypeComponent2);


        SecondSingleton secondSingleton1 = applicationContext.getBean(SecondSingleton.class);
        SecondSingleton secondSingleton2 = applicationContext.getBean(SecondSingleton.class);

        System.out.println(secondSingleton1 == secondSingleton2);

    }


}
