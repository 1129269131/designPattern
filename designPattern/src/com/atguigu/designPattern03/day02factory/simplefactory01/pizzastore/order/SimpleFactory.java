package com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.order;

import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.CheesePizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.GreekPizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.PepperPizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.Pizza;

/**
 * Create by koala on 2021-03-23
 */
//简单工厂类
public class SimpleFactory {

    //根据orderType 返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;

        System.out.println("使用简单工厂模式2");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

}
