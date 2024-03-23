package ru.levandr;

import ru.levandr.Beans.Injectable;
import ru.levandr.Beans.Source;
import ru.levandr.BeansFactory.BeanFactory;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.register(Injectable.class);
        beanFactory.register(Source.class);


    }
}