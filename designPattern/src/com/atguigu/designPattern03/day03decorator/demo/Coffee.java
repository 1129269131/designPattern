package com.atguigu.designPattern03.day03decorator.demo;

/**
 * Create by koala on 2021-03-24
 * 咖啡
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}