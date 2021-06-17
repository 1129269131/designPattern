package com.atguigu.designPattern03.day08bridge.demo;

/**
 * Create by koala on 2021-06-06
 */
public abstract class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.close();
    }

    protected void call() {
        brand.call();
    }

}
