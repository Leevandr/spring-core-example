package ru.levandr.FourLifeCycleBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class SimpleBean {
    public SimpleBean() {
        System.out.println("SimpleBean created");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("SimpleBean calling afterInit");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("I'm destroy (calling beforeDestroy)");
    }
}
