package com.lc.abstractFactory.factoryImpl;

import com.lc.abstractFactory.InterfaceController;
import com.lc.abstractFactory.SunnyController;
import com.lc.abstractFactory.SunnySystem;

public class SunnyConrollerSymbian implements SunnySystem {
    public SunnyController getController() {
        return new InterfaceController();
    }
}
