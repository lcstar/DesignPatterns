package com.lc.singleModel;

/**
 * 懒汉式单例
 * 优点：线程安全
 * 缺点：如果不使用的话，则浪费系统的资源。
 */
public class LazySingleModel {
    private final static LazySingleModel instance = new LazySingleModel();

    private LazySingleModel() {
    }

    public static LazySingleModel getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println("Do Something!");
    }
}
