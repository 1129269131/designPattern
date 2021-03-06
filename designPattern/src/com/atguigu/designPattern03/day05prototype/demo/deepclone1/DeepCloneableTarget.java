package com.atguigu.designPattern03.day05prototype.demo.deepclone1;

/**
 * Create by koala on 2021-06-03
 */
public class DeepCloneableTarget implements Cloneable {

    private String cloneName;

    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
