package com.atguigu.designPattern03.day21strategy.demo.improve;

/**
 * Create by koala on 2021-06-09
 */
public class WildDuck extends Duck {

    //构造器，传入FlyBehavor 的对象
    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~野鸭~~");
    }

}
