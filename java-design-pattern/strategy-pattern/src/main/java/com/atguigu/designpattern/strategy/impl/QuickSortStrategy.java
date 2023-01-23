package com.atguigu.designpattern.strategy.impl;

import com.atguigu.designpattern.strategy.SortStrategy;

import java.util.Arrays;

/**
 * 策略2：快速排序策略
 */
public class QuickSortStrategy implements SortStrategy {

    @Override
    public void sort(Integer[] arr) {
        System.out.println("快速排序开始");
        Arrays.sort(arr);
        System.out.println("排序结果：" + Arrays.asList(arr));
    }

}
