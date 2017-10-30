package com.lc.simpleFactory.model;
import com.lc.simpleFactory.model.Product;

public class ProductTwo extends Product {
    @Override
    public void diff() {
        System.out.println("This is the ProductTwo's diff method");
    }
}
