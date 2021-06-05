package com.atguigu.designPattern03.day07adapter.demo.objectadapter.demo;

/**
 * 被适配的类
 * Create by koala on 2021-06-05
 */
public class Voltage220V {
    //输出220V的电压，不变
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }
}
