package com.lc.simpleFactory.model;

public class ProductOne extends Product {
    @Override
    public void diff() {
        System.out.println("This is the ProductOne's diff method");
    }
}
