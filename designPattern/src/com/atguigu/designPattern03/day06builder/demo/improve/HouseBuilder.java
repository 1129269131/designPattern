package com.atguigu.designPattern03.day06builder.demo.improve;

/**
 * 抽象的建造者
 * Create by koala on 2021-06-05
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好, 抽象的方法
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //建造房子好，将产品(房子) 返回
    public House buildHouse() {
        return house;
    }

}
