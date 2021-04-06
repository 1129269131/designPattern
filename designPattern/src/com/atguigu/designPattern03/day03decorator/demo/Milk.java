package com.atguigu.designPattern03.day03decorator.demo;

/**
 * Create by koala on 2021-03-24
 * 牛奶
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
