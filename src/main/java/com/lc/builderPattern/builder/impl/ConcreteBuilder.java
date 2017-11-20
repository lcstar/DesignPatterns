package com.lc.builderPattern.builder.impl;

import com.lc.builderPattern.builder.Builder;

public class ConcreteBuilder extends Builder {
    public void buildPartA() {
        super.product.setPartA("this is PartA");
    }

    public void buildPartB() {
        super.product.setPartB("this is PartB");
    }

    public void buildPartC() {
        super.product.setPartC("this is PartC");
    }
}
