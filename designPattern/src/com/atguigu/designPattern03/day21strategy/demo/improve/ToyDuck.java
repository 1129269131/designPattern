package com.atguigu.designPattern03.day21strategy.demo.improve;

/**
 * Create by koala on 2021-06-09
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("~~玩具鸭~~");
    }

    //需要重写父类的所有方法
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫~~");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳~~");
    }

}

