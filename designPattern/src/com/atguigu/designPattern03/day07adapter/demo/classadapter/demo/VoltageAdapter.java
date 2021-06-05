package com.atguigu.designPattern03.day07adapter.demo.classadapter.demo;

/**
 * 适配器类
 * Create by koala on 2021-06-05
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        //获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44; //转成 5v
        return dstV;
    }

}
