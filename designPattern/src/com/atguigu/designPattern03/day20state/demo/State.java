package com.atguigu.designPattern03.day20state.demo;

/**
 * 状态抽象类
 * Create by koala on 2021-06-09
 */
public abstract class State {

    // 扣除积分 - 50
    public abstract void deductMoney();

    // 是否抽中奖品
    public abstract boolean raffle();

    // 发放奖品
    public abstract void dispensePrize();

}
