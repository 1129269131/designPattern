package com.atguigu.designPattern03.day03decorator.demo;

/**
 * Create by koala on 2021-03-24
 * 被装饰者
 */
public abstract class Drink {

    public String des; // 描述
    private float price = 0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();

}
