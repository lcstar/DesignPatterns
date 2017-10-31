package com.lc.abstractFactory.factoryImpl;

import com.lc.abstractFactory.AbstractFactory;
import com.lc.model.Product;
import com.lc.model.ProductTwo;

public class ProductTwoFactory implements AbstractFactory{
    public Product createProduct() {
        return new ProductTwo();
    }
}
