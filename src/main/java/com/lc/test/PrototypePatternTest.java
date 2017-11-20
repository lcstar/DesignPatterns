package com.lc.test;

import com.lc.model.ProductOne;
import com.lc.prototypePattern.Prototype;
import com.lc.prototypePattern.TestModel;
import org.junit.Test;

public class PrototypePatternTest {

    /**
     * 浅克隆
     * 类的地址不同
     * 类中的引用变量相同
     */
    @Test
    public void prototypePattern(){
        Prototype prototype = new Prototype();
        prototype.setI(12);
        prototype.setTest("Test");
        TestModel test1 = new TestModel();
        test1.setTest("Testtttt");
        prototype.setTestModel(test1);

        Prototype prototype1 = prototype.clone();
        prototype1.getTestModel().setTest("Test");
        System.out.println(prototype1 == prototype);
        System.out.println(prototype1.getTestModel() == prototype.getTestModel());
        System.out.println(prototype.getTestModel().getTest());
    }

    /**
     * 深克隆
     * 类的地址不同
     * 类中引用的变量的地址也不同
     */
    @Test
    public void Test1(){
        Prototype prototype = new Prototype();
        prototype.setI(12);
        prototype.setTest("Test");
        TestModel test1 = new TestModel();
        test1.setTest("Testtttt");
        prototype.setTestModel(test1);

        Prototype prototype1 = prototype.deepClone();

        prototype1.getTestModel().setTest("Test");
        System.out.println(prototype1 == prototype);
        System.out.println(prototype1.getTestModel() == prototype.getTestModel());
        System.out.println(prototype.getTestModel().getTest());
    }
}
