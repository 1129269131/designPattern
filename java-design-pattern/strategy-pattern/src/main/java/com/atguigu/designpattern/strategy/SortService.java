package com.atguigu.designpattern.strategy;

/**
 * 上下文：入口类
 */
public class SortService {
    /**
     * 拿到一个排序算法
     */
    private SortStrategy strategy;

    /**
     * 为了强制要求用户必须传入一个排序算法
     *
     * @param strategy
     */
    public SortService(SortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 随时动态更新排序算法
     *
     * @param strategy
     */
    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 才是别人调用的排序方法
     *
     * @param arr
     */
    public void sort(Integer[] arr) {
        strategy.sort(arr);
    }
}
