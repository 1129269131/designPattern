package com.atguigu.designpattern.template;

/**
 * 定义订单处理模板
 */
public abstract class OrderProcessTemplate {

    /**
     * 处理订单： 定义好算法骨架
     */
    public final void processOrder() {
        //1、选择商品
        doSelect();
        //2、进行支付
        doPayment();
        //3、开具发票
        doReceipt();
        //4、派送商品
        doDelivery();
    }

    public abstract void doSelect();

    public abstract void doPayment();

    public abstract void doReceipt();

    public abstract void doDelivery();
}
