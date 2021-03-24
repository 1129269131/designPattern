package com.atguigu.designPattern03.day02factory.observer05.demo.improve;

/**
 * Create by koala on 2021-03-24
 * 接口, 让WeatherData 来实现
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
