package com.atguigu.designPattern03.day12proxy.demo.cglib.demo;

/**
 * Create by koala on 2021-06-06
 */
public class TeacherDao {

    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }

}

