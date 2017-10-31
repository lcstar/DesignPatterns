package com.lc.test;

import com.lc.abstractFactory.AbstractFactory;
import com.lc.abstractFactory.AbstractFactoryUp;
import com.lc.abstractFactory.factoryImpl.ProductOneFactory;
import com.lc.abstractFactory.factoryImpl.ProductOneFactoryUp;
import com.lc.abstractFactory.factoryImpl.ProductTwoFactory;
import com.lc.abstractFactory.factoryImpl.ProductTwoFactoryUp;
import com.lc.model.Product;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest(){
        AbstractFactory factory = new ProductOneFactory();
        Product product1 = factory.createProduct();
        product1.diff();
        product1.same();
        System.out.println();

        factory = new ProductTwoFactory();
        product1 = factory.createProduct();
        product1.diff();
        product1.same();
        System.out.println();
    }


    @Test
    public void abstractFactoryUp(){
        AbstractFactoryUp factory = new ProductOneFactoryUp();
        factory.productDo();
        System.out.println();

        factory = new ProductTwoFactoryUp();
        factory.productDo();
        System.out.println();
    }
}
