package com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza;

/**
 * Create by koala on 2021-03-24
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 伦敦的胡椒pizza 准备原材料");
    }

}

