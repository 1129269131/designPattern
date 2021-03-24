package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.order;

import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.LDCheesePizza;
import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.LDPepperPizza;
import com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza.Pizza;

/**
 * Create by koala on 2021-03-24
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }

}
