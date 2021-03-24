package com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.order;

/**
 * Create by koala on 2021-03-24
 */

import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.LDCheesePizza;
import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.LDPepperPizza;
import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.Pizza;

class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }

        return pizza;
    }

}
