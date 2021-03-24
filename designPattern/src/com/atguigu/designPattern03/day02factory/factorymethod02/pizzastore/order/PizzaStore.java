package com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.order;

/**
 * Create by koala on 2021-03-24
 */
public class PizzaStore {

    public static void main(String[] args) {
        String loc = "bj";
        if (loc.equals("bj")) {
            //创建北京口味的各种Pizza
            new BJOrderPizza();
        } else {
            //创建伦敦口味的各种Pizza
            new LDOrderPizza();
        }
    }

}
