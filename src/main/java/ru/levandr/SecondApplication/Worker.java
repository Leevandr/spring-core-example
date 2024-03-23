package ru.levandr.SecondApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class Worker {

    @Autowired
    @Qualifier("simpleLogicClass") // @Qualifier Выбираем какой бин мы хотим вытащить из контекста и заинжектить в это поле
    private LogicClass simpleLogic;
    @Autowired
    @Qualifier("logicClassData")
    private LogicClass dataSimpleLogic;

    private DataComponent dataComponent;

    @Autowired
    public void setDataComponent(DataComponent dataComponent){
        this.dataComponent = dataComponent;
    }

    public void call(){
        simpleLogic.simpleLogic();
        dataSimpleLogic.printLogicData();
        dataComponent.someWork();
    }

}
