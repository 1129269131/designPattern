package com.atguigu.designPattern03.day02factory.factorymethod02.pizzastore.pizza;

/**
 * Create by koala on 2021-03-24
 */
public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 伦敦的奶酪pizza 准备原材料");
    }

}
