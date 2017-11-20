package com.lc.singleModel;

/**
 * 懒汉式单例
 * 缺点：线程不安全
 * 优点：节省系统资源
 */
public class HungrySingleModel {
    private final static HungrySingleModel instance = new HungrySingleModel();

    private HungrySingleModel() {
    }

    public static HungrySingleModel getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Do Something!");
    }


}
