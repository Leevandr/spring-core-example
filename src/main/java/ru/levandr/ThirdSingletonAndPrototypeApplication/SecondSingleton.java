package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class SecondSingleton {
    private final Instant createdTime;

    private final PrototypeComponent prototypeComponent;

    public SecondSingleton(PrototypeComponent prototypeComponent) {
        this.prototypeComponent = prototypeComponent;
        System.out.println("SecondSingleton created");
        createdTime = Instant.now();
        printCreatedTime();
        prototypeComponent.printCreatedTime();
    }

    public void printCreatedTime(){
        System.out.println("SecondSingleton created at: " + createdTime);
    }
}
