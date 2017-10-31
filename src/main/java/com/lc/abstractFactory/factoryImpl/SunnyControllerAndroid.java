package com.lc.abstractFactory.factoryImpl;

import com.lc.abstractFactory.OperationController;
import com.lc.abstractFactory.SunnyController;
import com.lc.abstractFactory.SunnySystem;

public class SunnyControllerAndroid implements SunnySystem{

    public SunnyController getController() {
        return new OperationController();
    }
}
