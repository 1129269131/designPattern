package com.atguigu.designPattern03.day19interpreter.demo;

import java.util.HashMap;

/**
 * 抽象类表达式，通过HashMap 键值对,可以获取到变量的值
 * Create by koala on 2021-06-09
 */
public abstract class Expression {
    // a + b - c
    // 解释公式和数值, key 就是公式(表达式) 参数[a,b,c], value就是就是具体值
    // HashMap {a=10, b=20}
    public abstract int interpreter(HashMap<String, Integer> var);
}
