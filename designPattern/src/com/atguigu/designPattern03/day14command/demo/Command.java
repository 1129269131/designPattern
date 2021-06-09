package com.atguigu.designPattern03.day14command.demo;

/**
 * 创建命令接口
 * Create by koala on 2021-06-08
 */
public interface Command {

    //执行动作(操作)
    public void execute();

    //撤销动作(操作)
    public void undo();

}
