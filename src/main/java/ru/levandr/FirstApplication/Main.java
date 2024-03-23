package ru.levandr.FirstApplication;

import ru.levandr.FirstApplication.Beans.AllBeans;
import ru.levandr.FirstApplication.Beans.Calculator.Calculator;
import ru.levandr.FirstApplication.Beans.Injectable;
import ru.levandr.FirstApplication.Beans.Source;
import ru.levandr.FirstApplication.BeansFactory.BeanFactory;

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