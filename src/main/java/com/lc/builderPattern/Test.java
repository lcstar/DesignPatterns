package com.lc.builderPattern;

import com.lc.builderPattern.advanced.Actor;
import com.lc.builderPattern.builder.ActorBuilder;
import com.lc.builderPattern.builder.Builder;
import com.lc.builderPattern.builder.impl.AngelBuilder;
import com.lc.builderPattern.builder.impl.ConcreteBuilder;
import com.lc.builderPattern.director.ActorController;
import com.lc.builderPattern.director.Director;
import com.lc.builderPattern.model.Product;
import com.lc.builderPattern.utils.XMLUtil;

public class Test {

    @org.junit.Test
    public void testBuilderPattern(){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        System.out.println(product);
    }

    @org.junit.Test
    public void testAdvancedBuilder(){
        ActorBuilder ab; //针对抽象建造者编程
        ab =  (ActorBuilder) XMLUtil.getBean(); //反射生成具体建造者对象

        ActorController ac = new  ActorController();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

        String  type = actor.getType();
        System.out.println(type  + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }

    @org.junit.Test
    public void test(){
        System.out.println(AngelBuilder.class.getName());
    }
}
