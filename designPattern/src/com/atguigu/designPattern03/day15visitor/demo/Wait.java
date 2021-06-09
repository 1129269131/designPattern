package com.atguigu.designPattern03.day15visitor.demo;

/**
 * Create by koala on 2021-06-08
 */
public class Wait extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价是该歌手待定 ..");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价是该歌手待定 ..");
    }

}