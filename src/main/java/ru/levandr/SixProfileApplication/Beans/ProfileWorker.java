package ru.levandr.SixProfileApplication.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.levandr.SixProfileApplication.EnvPrinter.EnvPrinter;

@Component
public class ProfileWorker {

    private final EnvPrinter envPrinter;


    @Autowired
    public ProfileWorker(EnvPrinter envPrinter) {
        this.envPrinter = envPrinter;
    }

    public void doWork() {
        envPrinter.printEnv();
    }

    public void doLevHuesos(){
        envPrinter.printMegaInfo();
    }
}
