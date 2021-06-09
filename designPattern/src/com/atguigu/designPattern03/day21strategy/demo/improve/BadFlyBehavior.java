package com.atguigu.designPattern03.day21strategy.demo.improve;

/**
 * Create by koala on 2021-06-09
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println(" 飞翔技术一般 ");
    }

}

