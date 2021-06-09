package com.atguigu.designPattern03.day14command.demo;

/**
 * Create by koala on 2021-06-08
 */
public class LightOnCommand implements Command {

    //聚合LightReceiver
    LightReceiver light;

    //构造器
    public LightOnCommand(LightReceiver light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        light.on();
    }


    @Override
    public void undo() {
        //调用接收者的方法
        light.off();
    }

}

