package com.atguigu.uml02.day06composition;

/**
 * Create by koala on 2021-03-23
 * 类图—组合关系(Composition)：表示的是整体和部分的关系，且整体与部分不可以分开
 */
public class Computer {
    
    private Mouse mouse = new Mouse();//鼠标和Computer不能分离

    private Monitor monitor = new Monitor();//显示器和Computer不能分离

}
