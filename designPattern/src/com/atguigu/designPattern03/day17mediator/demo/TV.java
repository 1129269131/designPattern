package com.atguigu.designPattern03.day17mediator.demo;

/**
 * Create by koala on 2021-06-08
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.GetMediator().GetMessage(stateChange, this.name);
    }

    public void StartTv() {
        System.out.println("It's time to StartTv!");
    }

    public void StopTv() {
        System.out.println("StopTv!");
    }
}
