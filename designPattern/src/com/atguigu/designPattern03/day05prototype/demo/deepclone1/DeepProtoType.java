package com.atguigu.designPattern03.day05prototype.demo.deepclone1;

import java.io.Serializable;

/**
 * 深拷贝基本介绍
 *      1) 复制对象的所有基本数据类型的成员变量值
 *      2) 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝
 *      3) 深拷贝实现方式1：重写clone方法来实现深拷贝
 *      4) 深拷贝实现方式2：通过对象序列化实现深拷贝(推荐)
 * Create by koala on 2021-06-03
 */
public class DeepProtoType implements Serializable, Cloneable {

    public String name; //String 属性
    public DeepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepProtoType() {
        super();
    }

    //深拷贝 - 方式 1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

}
