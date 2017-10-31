package com.lc.test;

import com.lc.singleModel.HungrySingleModel;
import com.lc.singleModel.IoDHSingleModel;
import com.lc.singleModel.LazySingleModel;
import org.junit.Test;

public class SingleModelTest {

    @Test
    public void lazySingle(){
        LazySingleModel singleModel = LazySingleModel.getInstance();
        LazySingleModel singleModel1 = LazySingleModel.getInstance();
        System.out.println(singleModel == singleModel1);
    }


    @Test
    public void hungrySingle(){
        HungrySingleModel model = HungrySingleModel.getInstance();
        HungrySingleModel model1 = HungrySingleModel.getInstance();
        System.out.println(model == model1);
    }


    @Test
    public void IoDHSingle(){
        IoDHSingleModel model = IoDHSingleModel.getInstance();
        IoDHSingleModel model1 = IoDHSingleModel.getInstance();
        System.out.println(model == model1);
    }
}
