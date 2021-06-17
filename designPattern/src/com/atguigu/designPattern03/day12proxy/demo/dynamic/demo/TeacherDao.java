package com.atguigu.designPattern03.day12proxy.demo.dynamic.demo;

/**
 * Create by koala on 2021-06-06
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中....");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

}