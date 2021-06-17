package com.atguigu.designPattern03.day21strategy.demo.improve;

/**
 * Create by koala on 2021-06-09
 */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(" 不会飞翔 ~~~");
    }

}

