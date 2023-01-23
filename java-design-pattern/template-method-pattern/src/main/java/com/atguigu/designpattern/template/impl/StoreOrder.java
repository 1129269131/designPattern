package com.atguigu.designpattern.template.impl;

import com.atguigu.designpattern.template.OrderProcessTemplate;

/**
 * 门店订单：子类实现具体算法
 */
public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("用户选择了：3号货架-xiaomi11 商品");
    }

    @Override
    public void doPayment() {
        System.out.println("刷卡机：刷卡支付 1999");
    }

    @Override
    public void doReceipt() {
        System.out.println("打印发票，和物品一起包装");
    }

    @Override
    public void doDelivery() {
        System.out.println("把商品交给用户，用漂亮的袋子");
    }
}
