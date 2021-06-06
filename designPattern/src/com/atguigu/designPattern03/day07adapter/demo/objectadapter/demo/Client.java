package com.atguigu.designPattern03.day07adapter.demo.objectadapter.demo;

/**
 * Create by koala on 2021-06-05
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 ====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }

}