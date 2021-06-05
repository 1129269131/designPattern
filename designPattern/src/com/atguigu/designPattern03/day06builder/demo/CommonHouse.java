package com.atguigu.designPattern03.day06builder.demo;

/**
 * Create by koala on 2021-06-05
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子封顶 ");
    }

}
