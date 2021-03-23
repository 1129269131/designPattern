package com.atguigu.uml02.day01dependence;

/**
 * Create by koala on 2021-03-23
 * 类图—依赖关系(Dependence)：只要是在类中用到了对方，那么他们之间就存在依赖关系
 */
public class PersonServiceBean {
    private PersonDao personDao;// 类

    public void save(Person person) {
    }

    public IDCard getIDCard(Integer personid) {
        return null;
    }

    public void modify() {
        Department department = new Department();
    }
}
