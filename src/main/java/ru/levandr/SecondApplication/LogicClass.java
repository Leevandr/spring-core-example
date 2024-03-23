package ru.levandr.SecondApplication;

import java.text.MessageFormat;

public class LogicClass {

    private String name;
    private int code;

    public LogicClass() {
        System.out.println("LogicClass was initialize");
    }

    public LogicClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void simpleLogic() {
        System.out.println("Simple class logic");
    }

    //Todo: Ознакомится с MessageFormat в частности с методом .format
    public void printLogicData(){
        System.out.println(MessageFormat.format("Simple logic data: {0}, {1}", name, code));
    }
}
