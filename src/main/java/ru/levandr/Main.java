package ru.levandr;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.register(Injectable.class);
        beanFactory.register(Source.class);



    }
}