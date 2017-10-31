package com.lc.abstractFactory.factoryImpl;

import com.lc.abstractFactory.AbstractFactory;
import com.lc.model.Product;
import com.lc.model.ProductOne;

public class ProductOneFactory implements AbstractFactory {
    public Product createProduct() {
        return new ProductOne();
    }
}
