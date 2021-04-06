package com.atguigu.uml02.day05aggregation;

/**
 * Create by koala on 2021-03-23
 * 类图—聚合关系(Aggregation)：
 *      1、聚合关系（Aggregation）表示的是整体和部分的关系，整体与部分可以分开
 *      2、聚合关系是关联关系的特例，所以他具有关联的导航性与多重性
 */
public class Computer {

    private Mouse mouse; //鼠标可以和Computer分离

    private Monitor monitor;//显示器可以和Computer分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Monitor monitor) {
        this.monitor = monitor;
    }

}
