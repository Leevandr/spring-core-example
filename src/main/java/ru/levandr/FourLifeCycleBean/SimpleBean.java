package ru.levandr.FourLifeCycleBean;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.lang.NonNull;

public class SimpleBean implements InitializingBean, DisposableBean, BeanNameAware {


    private String beanName;


    public SimpleBean() {
        System.out.println("SimpleBean created");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I'm destroy (calling beforeDestroy)");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleBean calling afterInit");
    }

    @Override
    public void setBeanName(@NonNull String name) {
        this.beanName = name;
    }

    public void printName(){
        System.out.println("Bean name is: " + beanName);
    }

}
