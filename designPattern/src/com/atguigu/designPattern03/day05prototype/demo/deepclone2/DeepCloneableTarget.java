package com.atguigu.designPattern03.day05prototype.demo.deepclone2;

import java.io.Serializable;

/**
 * Create by koala on 2021-06-03
 */
public class DeepCloneableTarget implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    //构造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }
}
