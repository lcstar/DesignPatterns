package com.lc.builderPattern.director;

import com.lc.builderPattern.builder.Builder;
import com.lc.builderPattern.model.Product;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
