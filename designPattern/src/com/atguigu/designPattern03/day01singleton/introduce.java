package com.atguigu.designPattern03.day01singleton;

/**
 * Create by koala on 2021-03-23
 * 单例设计模式：
 *      基本介绍：
 *          所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，
 *              并且该类只提供一个取得其对象实例的方法(静态方法)。
 *
 *      注意事项和细节说明：
 *          1) 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些需要频繁创建销毁的对象，
 *              使用单例模式可以提高系统性能
 *          2) 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new
 *          3) 单例模式使用的场景：需要频繁的进行创建和销毁的对象、创建对象时耗时过多或
 *              耗费资源过多(即：重量级对象)，但又经常用到的对象、工具类对象、频繁访问数据库
 *              或文件的对象(比如数据源、session工厂等)
 */
public class Introduce {
}
