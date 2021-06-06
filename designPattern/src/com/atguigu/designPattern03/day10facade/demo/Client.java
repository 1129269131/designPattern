package com.atguigu.designPattern03.day10facade.demo;

/**
 * Create by koala on 2021-06-06
 */
public class Client {

    public static void main(String[] args) {
        //这里直接调用。。 很麻烦
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        homeTheaterFacade.end();
    }

}
