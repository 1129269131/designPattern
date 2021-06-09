package com.atguigu.designPattern03.day17mediator.demo;

/**
 * 同事抽象类
 * Create by koala on 2021-06-08
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator GetMediator() {
        return this.mediator;
    }

    public abstract void SendMessage(int stateChange);
}
