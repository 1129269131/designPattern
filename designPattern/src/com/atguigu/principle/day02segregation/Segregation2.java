package com.atguigu.principle.day02segregation;

/**
 * Create by koala on 2021-03-22
 * 接口隔离原则
 */
public class Segregation2 {

    public static void main(String[] args) {
        A2 a = new A2();
        a.depend1(new B2()); // A2类通过接口去依赖B2类
        a.depend2(new B2());
        a.depend3(new B2());

        C2 c = new C2();

        c.depend1(new D2()); // C2类通过接口去依赖(使用)D2类
        c.depend4(new D2());
        c.depend5(new D2());
    }

}

// 接口1
interface Interface21 {
    void operation1();

}

// 接口2
interface Interface22 {
    void operation2();

    void operation3();
}

// 接口3
interface Interface23 {
    void operation4();

    void operation5();
}

class B2 implements Interface21, Interface22 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

}

class D2 implements Interface21, Interface23 {

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A2 { // A2 类通过接口Interface1,Interface2 依赖(使用) B2类，但是只会用到1,2,3方法

    public void depend1(Interface21 i) {
        i.operation1();
    }

    public void depend2(Interface22 i) {
        i.operation2();
    }

    public void depend3(Interface22 i) {
        i.operation3();
    }
}

class C2 { // C2 类通过接口Interface1,Interface3 依赖(使用) D2类，但是只会用到1,4,5方法

    public void depend1(Interface21 i) {
        i.operation1();
    }

    public void depend4(Interface23 i) {
        i.operation4();
    }

    public void depend5(Interface23 i) {
        i.operation5();
    }
}