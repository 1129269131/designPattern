package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.order;

/**
 * Create by koala on 2021-03-24
 */
public class PizzaStore {

    public static void main(String[] args) {
        //new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
    }

}
