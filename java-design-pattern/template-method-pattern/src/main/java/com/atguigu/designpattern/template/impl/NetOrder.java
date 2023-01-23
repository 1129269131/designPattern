package com.atguigu.designpattern.template.impl;

import com.atguigu.designpattern.template.OrderProcessTemplate;

/**
 * 网络订单：算法细节实现
 */
public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("把 xiaomi11 加入购物车");
    }

    @Override
    public void doPayment() {
        System.out.println("在线微信支付 1999");
    }

    @Override
    public void doReceipt() {
        System.out.println("发票已经发送给用户邮箱： aaaa@qq.com");
    }

    @Override
    public void doDelivery() {
        System.out.println("顺丰次日达：投送商品");
    }
}
