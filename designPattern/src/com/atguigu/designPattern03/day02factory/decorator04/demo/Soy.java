package com.atguigu.designPattern03.day02factory.decorator04.demo;

/**
 * Create by koala on 2021-03-24
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }

}
