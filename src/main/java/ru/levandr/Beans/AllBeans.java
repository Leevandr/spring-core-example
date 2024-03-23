package ru.levandr.Beans;

import ru.levandr.Annotation.Inject;
import ru.levandr.Beans.Calculator.Calculator;
import ru.levandr.Beans.Calculator.Expression;

public class AllBeans {

    @Inject
    private Source source;
    @Inject
    private Injectable injectable;
    @Inject
    private Calculator calculator;


    public void message() {
        System.out.println("Source bean");
        source.call();
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Injectable bean");
        injectable.doWork();
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Calculator bean");
        calculator.calculateIntegers(10,10, Expression.PLUS);
        calculator.calculateIntegers(10,10, Expression.MINUS);
        calculator.calculateIntegers(10,10, Expression.DIVISION);
        calculator.calculateIntegers(10,10, Expression.MULTIPLICATION);
        calculator.calculateIntegers(10,10, Expression.Exponentiation);
    }
}
