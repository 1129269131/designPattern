package com.atguigu.designpattern.strategy.impl;

import com.atguigu.designpattern.strategy.SortStrategy;

import java.util.Arrays;

/**
 * 策略1：冒泡排序策略
 */
public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(Integer[] arr) {
        System.out.println("开始冒泡排序....");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("排序结果：" + Arrays.asList(arr));
    }
}
