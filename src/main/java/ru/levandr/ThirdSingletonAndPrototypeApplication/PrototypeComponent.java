package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Scope("prototype")
@Component
public class PrototypeComponent {
    public final Instant createdTime;

    public PrototypeComponent() {
        System.out.println("PrototypeComponent created");
        createdTime = Instant.now();
        printCreatedTime();
    }

    public void printCreatedTime() {
        System.out.println("PrototypeComponent created at: " + createdTime);
    }
}
