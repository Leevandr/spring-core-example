package ru.levandr.ThirdSingletonAndPrototypeApplication;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectFactoryHolder {
    private final ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory;

    private final ObjectFactory<FirstSingleton> firstSingletonObjectFactory;

    private final ObjectFactory<MathAlgorithm> mathAlgorithmObjectFactory;

    @Autowired // Необязательно (спринг автоматический может внедрить тк конструктор 1)
    public ObjectFactoryHolder(ObjectFactory<PrototypeComponent> prototypeComponentObjectFactory,
                               ObjectFactory<FirstSingleton> firstSingletonObjectFactory,
                               ObjectFactory<MathAlgorithm> mathAlgorithmObjectFactory) {

        this.prototypeComponentObjectFactory = prototypeComponentObjectFactory;
        this.firstSingletonObjectFactory = firstSingletonObjectFactory;
        this.mathAlgorithmObjectFactory = mathAlgorithmObjectFactory;
    }

    public FirstSingleton getSingleton() {
        return firstSingletonObjectFactory.getObject();
    }

    public PrototypeComponent getPrototype() {
        return prototypeComponentObjectFactory.getObject();
    }
    public MathAlgorithm getmathAlgorithm(){
        return mathAlgorithmObjectFactory.getObject();
    }
}
