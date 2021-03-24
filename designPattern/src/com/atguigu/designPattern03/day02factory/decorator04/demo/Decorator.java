package com.atguigu.designPattern03.day02factory.decorator04.demo;

/**
 * Create by koala on 2021-03-24
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
