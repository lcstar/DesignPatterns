package com.lc.test;

import com.lc.simpleFactory.SimpleFactroy;
import com.lc.model.Product;
import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void simpleFactoryTest(){
        Product product1 = SimpleFactroy.createProduct("productOne");
        product1.diff();
        product1.same();
        System.out.println();

        Product product2 = SimpleFactroy.createProduct("productTwo");
        product2.diff();
        product2.same();

    }
}
