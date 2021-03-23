package com.atguigu.uml02.day04aggregation;

/**
 * Create by koala on 2021-03-23
 * 类图—关联关系(Association)：
 *      1、关联关系实际上就是类与类之间的联系，他是依赖关系的特例
 *      2、关联具有导航性：即双向关系或单向关系
 *      3、关系具有多重性：
 *          如：
 *           “1”（表示有且仅有一个）
 *           “0...”（表示0个或者多个）
 *           “0，1”（表示0个或者一个）
 *          “n...m”(表示n到 m个都可以)
 *           ”...*”（表示至少m个）
 *
 * 类图—聚合关系(Aggregation)：
 *      1、聚合关系（Aggregation）表示的是整体和部分的关系，整体与部分可以分开
 *      2、聚合关系是关联关系的特例，所以他具有关联的导航性与多重性
 */
public class Computer {

    private Mouse mouse; //鼠标可以和computer分离

    private Monitor monitor;//显示器可以和Computer分离

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMoniter(Monitor monitor) {
        this.monitor = monitor;
    }

}
