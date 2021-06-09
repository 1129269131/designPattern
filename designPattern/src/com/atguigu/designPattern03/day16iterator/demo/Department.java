package com.atguigu.designPattern03.day16iterator.demo;

/**
 * Create by koala on 2021-06-08
 */
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
        super();
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
