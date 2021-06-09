package com.atguigu.designPattern03.day15visitor.demo;

/**
 * Create by koala on 2021-06-08
 */
public abstract class Person {

    //提供一个方法，让访问者可以访问
    public abstract void accept(Action action);
}
