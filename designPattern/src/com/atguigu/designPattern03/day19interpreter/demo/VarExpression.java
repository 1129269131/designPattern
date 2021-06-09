package com.atguigu.designPattern03.day19interpreter.demo;

import java.util.HashMap;

/**
 * 变量的解释器
 * Create by koala on 2021-06-09
 */
public class VarExpression extends Expression {

    private String key; // key=a,key=b,key=c

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}