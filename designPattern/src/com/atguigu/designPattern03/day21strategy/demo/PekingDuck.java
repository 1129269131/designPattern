package com.atguigu.designPattern03.day21strategy.demo;

/**
 * Create by koala on 2021-06-09
 */
public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println("~~北京鸭~~~");
    }

    //因为北京鸭不能飞翔，因此需要重写fly
    @Override
    public void fly() {
        System.out.println("北京鸭不能飞翔");
    }

}
