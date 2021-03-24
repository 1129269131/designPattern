package com.atguigu.designPattern03.day02factory.absfactory03.pizzastore;

/**
 * Create by koala on 2021-03-24
 * 抽象工厂模式：
 *      1) 抽象工厂模式：定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
 *      2) 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
 *      3) 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)。
 *      4) 将工厂抽象成两层，AbsFactory(抽象工厂) 和 具体实现的工厂子类。
 *         程序员可以根据创建对象类型使用对应的工厂子类。
 *         这样将单个的简单工厂类变成了工厂簇，更利于代码的维护和扩展。
 *
 * 工厂模式小结：
 *      1) 工厂模式的意义将实例化对象的代码提取出来，放到一个类中统一管理和维护，达到和主项目的依赖关系的解耦。
 *          从而提高项目的扩展和维护性。
 *      2) 三种工厂模式 (简单工厂模式、工厂方法模式、抽象工厂模式)
 *      3) 设计模式的依赖抽象原则
 *           创建对象实例时，不要直接 new 类, 而是把这个new 类的动作放在一个工厂的方法中，并返回。
 *              有的书上说，变量不要直接持有具体类的引用。
 *           不要让类继承具体类，而是继承抽象类或者是实现interface(接口)
 *           不要覆盖基类中已经实现的方法。
 */
public class introduce {

}