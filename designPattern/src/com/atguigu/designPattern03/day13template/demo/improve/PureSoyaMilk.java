package com.atguigu.designPattern03.day13template.demo.improve;

/**
 * Create by koala on 2021-06-08
 */
public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        //空实现
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }

}
