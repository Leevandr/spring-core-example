package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Scope("singleton")
@Component
public class FirstSingleton {

    private final Instant createdTime;

    public FirstSingleton() {
        System.out.println("FirstSingleton created");
        createdTime = Instant.now();
        printCreatedTime();
    }

    public void printCreatedTime(){
        System.out.println("FirstSingleton created at: " + createdTime);
    }
}
