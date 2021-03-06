package com.atguigu.designPattern03.day16iterator.demo;

import java.util.Iterator;
import java.util.List;

/**
 * Create by koala on 2021-06-08
 */
public class InfoColleageIterator implements Iterator {

    List<Department> departmentList; // 信息工程学院是以List方式存放系
    int index = -1;//索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    //判断list中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现remove
    @Override
    public void remove() {
    }

}
