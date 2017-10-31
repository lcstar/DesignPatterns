package com.lc.singleModel;

/**
 * 饿憨式单例
 * 缺点：线程不安全
 * 优点：节省系统资源
 */
public class HungrySingleModel {

    private static HungrySingleModel instance = null;

    private HungrySingleModel() {
    }

    public static HungrySingleModel getInstance() {
        if (instance == null) {
            return instance = new HungrySingleModel();
        }else{
            return instance;
        }

    }

    public static HungrySingleModel getInstanceOther() {
        if (instance == null) {
            instance = new HungrySingleModel();
        }
        return instance;
    }
}
