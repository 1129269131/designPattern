package com.atguigu.designPattern03.day16iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by koala on 2021-06-08
 */
public class Client {

    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPutImpl = new OutPutImpl(collegeList);
        outPutImpl.printCollege();
    }

}
