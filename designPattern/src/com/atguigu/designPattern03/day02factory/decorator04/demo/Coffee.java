package com.atguigu.designPattern03.day02factory.decorator04.demo;

/**
 * Create by koala on 2021-03-24
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}