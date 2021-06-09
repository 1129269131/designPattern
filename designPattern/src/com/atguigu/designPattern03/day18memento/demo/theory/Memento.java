package com.atguigu.designPattern03.day18memento.demo.theory;

/**
 * Create by koala on 2021-06-09
 */
public class Memento {
    private String state;

    //构造器
    public Memento(String state) {
        super();
        this.state = state;
    }

    public String getState() {
        return state;
    }

}

