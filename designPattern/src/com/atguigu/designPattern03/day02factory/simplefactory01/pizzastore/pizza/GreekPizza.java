package com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza;

/**
 * Create by koala on 2021-03-23
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }

}
