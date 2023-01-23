package com.atguigu.designpattern.strategy;

/**
 * 算法接口：排序策略
 */
public interface SortStrategy {

    /**
     * 排序
     */
    void sort(Integer[] arr);
}
