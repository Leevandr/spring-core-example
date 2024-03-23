package ru.levandr;

import ru.levandr.Beans.AllBeans;
import ru.levandr.Beans.Calculator.Calculator;
import ru.levandr.Beans.Injectable;
import ru.levandr.Beans.Source;
import ru.levandr.BeansFactory.BeanFactory;

public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.register(Injectable.class);
        beanFactory.register(Source.class);
        beanFactory.register(Calculator.class);
        beanFactory.register(AllBeans.class);


        AllBeans allBeans = beanFactory.getBean(AllBeans.class);
        allBeans.message();



    }
}