package com.atguigu.designPattern03.day16iterator.demo;

import java.util.Iterator;

/**
 * Create by koala on 2021-06-08
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();

}

