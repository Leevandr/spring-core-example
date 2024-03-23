package ru.levandr.FirstApplication.Annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 2 Доступ к аннотации в рантайме
public @interface Inject {
//1 Эту аннотацию мы будем использовать

}
