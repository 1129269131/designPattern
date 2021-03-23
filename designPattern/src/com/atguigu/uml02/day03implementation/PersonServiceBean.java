package com.atguigu.uml02.day03implementation;

/**
 * Create by koala on 2021-03-23
 * 类图—实现关系(Implementation)：实现关系实际上就是A类实现B接口，他是依赖关系的特例
 */
public class PersonServiceBean implements PersonService{

    @Override
    public void delete(Integer id) {
        System.out.println("delete...");
    }

}
