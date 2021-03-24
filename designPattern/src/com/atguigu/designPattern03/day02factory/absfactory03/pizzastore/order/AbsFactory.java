package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.order;

import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.Pizza;

/**
 * Create by koala on 2021-03-24
 * 一个抽象工厂模式的抽象层(接口)
 */
public interface AbsFactory {

    //让下面的工厂子类来 具体实现
    public Pizza createPizza(String orderType);

}
