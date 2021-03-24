package com.atguigu.designPattern03.day02factory.decorator04.demo;

/**
 * Create by koala on 2021-03-24
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
