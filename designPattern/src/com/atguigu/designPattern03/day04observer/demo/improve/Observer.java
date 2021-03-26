package com.atguigu.designPattern03.day04observer.demo.improve;

/**
 * Create by koala on 2021-03-24
 * 观察者接口，由观察者来实现
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);

}

