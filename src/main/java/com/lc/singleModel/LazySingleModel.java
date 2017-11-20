package com.lc.singleModel;

/**
 * 饿汉式单例
 * 优点：线程安全
 * 缺点：如果不使用的话，则浪费系统的资源。
 */
public class LazySingleModel {
    private static LazySingleModel instance = null;

    private LazySingleModel() {
    }

    public static LazySingleModel getInstance() {
        if (instance == null) {
            return instance = new LazySingleModel();
        }else{
            return instance;
        }

    }

    public static LazySingleModel getInstanceOther() {
        if (instance == null) {
            instance = new LazySingleModel();
        }
        return instance;
    }
}
