package com.lc.simpleFactory;


import com.lc.model.Product;
import com.lc.model.ProductOne;
import com.lc.model.ProductTwo;

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