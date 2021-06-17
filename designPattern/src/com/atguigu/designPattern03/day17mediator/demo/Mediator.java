package com.atguigu.designPattern03.day17mediator.demo;

/**
 * 抽象中介者类
 * Create by koala on 2021-06-08
 */
public abstract class Mediator {
    //将给中介者对象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    //接收消息, 具体的同事对象发出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}

