package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore.pizza;

/**
 * Create by koala on 2021-03-24
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 北京的胡椒pizza 准备原材料");
    }

}