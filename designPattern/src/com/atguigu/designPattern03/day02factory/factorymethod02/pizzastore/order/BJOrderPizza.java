package com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.order;

import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.BJCheesePizza;
import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.BJPepperPizza;
import com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza.Pizza;

/**
 * Create by koala on 2021-03-24
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if(orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }

        return pizza;
    }

}
