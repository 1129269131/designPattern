package com.atguigu.designPattern03.day15visitor.demo;

/**
 * Create by koala on 2021-06-08
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
