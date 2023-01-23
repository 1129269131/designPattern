package com.atguigu.designpattern;


import com.atguigu.designpattern.strategy.SortService;
import com.atguigu.designpattern.strategy.impl.BubbleSortStrategy;
import com.atguigu.designpattern.strategy.impl.QuickSortStrategy;

/**
 * day02：
 *      策略模式
 *
 * 模板模式与策略模式的区别：
 *      模板模式定义大框架、策略模式定义小细节
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2,4,6,3,1,7,9,8};

        SortService sortService = new SortService(new BubbleSortStrategy());
        sortService.sort(arr);

        System.out.println("===============");

        //更新策略
        sortService.setStrategy(new QuickSortStrategy());
        sortService.sort(arr);
    }
}
