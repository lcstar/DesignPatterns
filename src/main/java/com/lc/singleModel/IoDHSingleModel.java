package com.lc.singleModel;

public class IoDHSingleModel {

    private IoDHSingleModel(){

    }
    private static class InnerClass{
        private final static IoDHSingleModel instance = new IoDHSingleModel();
    }

    public static IoDHSingleModel getInstance(){
        return InnerClass.instance;
    }
}
