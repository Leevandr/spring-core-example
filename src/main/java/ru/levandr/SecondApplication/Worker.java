package ru.levandr.SecondApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Worker {

    private final LogicClass simpleLogic;
    private final LogicClass dataSimpleLogic;
    private final DataComponent dataComponent;

    @Autowired
    public Worker(
            @Qualifier("simpleLogicClass") LogicClass simpleLogicClass,
            @Qualifier("logicClassData") LogicClass logicClassData,
            DataComponent dataComponent) {

        this.simpleLogic = simpleLogicClass;
        this.dataSimpleLogic = logicClassData;
        this.dataComponent = dataComponent;
    }

    public void call() {
        simpleLogic.simpleLogic();
        dataSimpleLogic.printLogicData();
        dataComponent.someWork();
    }
}
