package com.atguigu.designPattern03.day03decorator.demo;

/**
 * Create by koala on 2021-03-24
 * 巧克力
 */
//具体的Decorator，这里就是调味品
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }

}

