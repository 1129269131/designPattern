package com.atguigu.designpattern;


import com.atguigu.designpattern.template.OrderProcessTemplate;
import com.atguigu.designpattern.template.impl.NetOrder;
import com.atguigu.designpattern.template.impl.StoreOrder;

/**
 * day01：模板方法模式测试
 *
 * 设计模式：  多定义接口、抽象类
 * 1）、依赖倒置； 依赖抽象
 * 2）、多态；    随便替换实现
 *
 * 核心： 父类定义算法骨架，子类实现算法细节
 */
public class TemplateMethodPatternTest {

    public static void main(String[] args) {
        //行为型模式玩的就是一个多态
        //1、外界调用模板类【遵循依赖反转原则】【依赖抽象而不是细节】
        OrderProcessTemplate processTemplate = new NetOrder();
        System.out.println("网络订单：");
        //处理订单
        processTemplate.processOrder(); //定义了算法的模板


        processTemplate = new StoreOrder();
        System.out.println("门店订单：");
        processTemplate.processOrder();
    }
}
