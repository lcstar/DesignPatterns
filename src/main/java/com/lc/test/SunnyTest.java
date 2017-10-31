package com.lc.test;

import com.lc.abstractFactory.SunnyController;
import com.lc.abstractFactory.SunnySystem;
import com.lc.abstractFactory.factoryImpl.SunnyConrollerSymbian;
import com.lc.abstractFactory.factoryImpl.SunnyControllerAndroid;
import org.junit.Test;

public class SunnyTest {
    @Test
    public void Test(){
        SunnySystem system = new SunnyConrollerSymbian();
        SunnyController controller = system.getController();
        controller.doSomething();

        System.out.println();

        system = new SunnyControllerAndroid();
        controller = system.getController();
        controller.doSomething();
    }


}
