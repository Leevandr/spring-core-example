package ru.levandr.FirstApplication.Beans;

import ru.levandr.FirstApplication.Annotation.Inject;


public class Source {
    // Класс в который мы будем внедрять наш Injectable класс

    @Inject // Наша аннотация
    private Injectable injectable; // Свойство

    public void call() {
        // Просто метод
        System.out.println("Source calling call");
        injectable.doWork();

    }
}
