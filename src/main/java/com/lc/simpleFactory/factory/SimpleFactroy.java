package com.lc.simpleFactory.factory;


import com.lc.simpleFactory.model.Product;
import com.lc.simpleFactory.model.ProductOne;
import com.lc.simpleFactory.model.ProductTwo;

public class SimpleFactroy{

    public static Product createProduct(String productName){
        if(productName.equals("productOne")){
            return new ProductOne();
        }else if(productName.equals("productTwo")){
            return new ProductTwo();
        }
        return null;
    }
}