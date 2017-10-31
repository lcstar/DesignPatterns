package com.lc.abstractFactory.factoryImpl;

import com.lc.abstractFactory.AbstractFactory;
import com.lc.abstractFactory.AbstractFactoryUp;
import com.lc.model.Product;
import com.lc.model.ProductOne;

public class ProductOneFactoryUp extends AbstractFactoryUp {
    public Product createProduct() {
        return new ProductOne();
    }
}
