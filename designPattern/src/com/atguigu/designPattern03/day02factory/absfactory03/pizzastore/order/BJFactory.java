package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.order;

import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.BJCheesePizza;
import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.BJPepperPizza;
import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.Pizza;

/**
 * Create by koala on 2021-03-24
 * 这是工厂子类
 */
public class BJFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }

}
