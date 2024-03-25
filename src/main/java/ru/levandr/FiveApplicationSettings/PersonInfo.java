package ru.levandr.FiveApplicationSettings;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class PersonInfo {

    @Value("${app.person.name}")
    private String name;
    @Value("${app.person.surname}")
    private String surname;
    @Value("${app.person.age}")
    private int age;

    public void printInfo(){
        System.out.println(MessageFormat.format("User info: {0} {1}\nAge: {2}", name, surname, age));
    }

}
