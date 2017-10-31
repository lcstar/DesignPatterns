package com.lc.abstractFactory;

import com.lc.model.Product;

public abstract class AbstractFactoryUp {
    public void productDo(){
        Product product = this.createProduct();
        product.diff();
    }

    public abstract Product createProduct();
}
