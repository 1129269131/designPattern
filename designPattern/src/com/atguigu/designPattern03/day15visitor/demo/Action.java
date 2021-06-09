package com.atguigu.designPattern03.day15visitor.demo;

/**
 * Create by koala on 2021-06-08
 */
public abstract class Action {

    //得到男性 的测评
    public abstract void getManResult(Man man);

    //得到女的 测评
    public abstract void getWomanResult(Woman woman);

}
