package com.atguigu.designPattern03.day08bridge.demo;

/**
 * Create by koala on 2021-06-06
 */
public class Vivo implements Brand {

    @Override
    public void open() {
        System.out.println(" Vivo手机开机 ");
    }

    @Override
    public void close() {
        System.out.println(" Vivo手机关机 ");
    }

    @Override
    public void call() {
        System.out.println(" Vivo手机打电话 ");
    }

}
