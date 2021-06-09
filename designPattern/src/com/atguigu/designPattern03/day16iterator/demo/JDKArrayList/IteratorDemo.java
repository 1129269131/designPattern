package com.atguigu.designPattern03.day16iterator.demo.JDKArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式在JDK-ArrayList集合应用的源码分析
 *  角色分析和说明：
 *      1）内部类 Itr 充当具体实现迭代器 Iterator 的类， 它是 ArrayList 的内部类
 *      2）List 充当了聚合接口，含有一个 iterator() 方法，返回一个迭代器对象
 *      3）ArrayList 是实现聚合接口 List 的子类，实现了 iterator()
 *      4）LinkedList并没有实现iterator()方法，是从它的抽象父类中继承而来的。
 *      5）Iterator 接口：由系统提供
 *      6）迭代器模式解决了 不同集合(如ArrayList ,LinkedList等) 的统一遍历问题
 * Create by koala on 2021-06-08
 */
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");// ..
        // 获取到迭代器
        Iterator Itr = a.iterator();
        while (Itr.hasNext()) {
            System.out.println(Itr.next());
        }
    }

}
