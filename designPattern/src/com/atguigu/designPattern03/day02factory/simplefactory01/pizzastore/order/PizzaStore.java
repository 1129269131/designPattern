package com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.order;

/**
 * Create by koala on 2021-03-23
 * 相当于一个客户端，发出订购
 *
 * 测试方式：
 *      1、启动main方法
 *      2、控制台输入：greek|cheese|pepper|other
 *      3、查看输出
 */
public class PizzaStore {

    public static void main(String[] args) {
        //传统方式调用
        new OrderPizza0();

        //方式一：使用简单工厂模式
        //new OrderPizza1(new SimpleFactory());

        //方式二：使用静态工厂模式
        //new OrderPizza2();

        System.out.println("~~退出程序~~");
    }

}
