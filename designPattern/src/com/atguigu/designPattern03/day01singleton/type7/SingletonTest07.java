package com.atguigu.designPattern03.day01singleton.type7;

/**
 * Create by koala on 2021-03-23
 * 枚举：
 *      优缺点说明：
 *          1) 这借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，
 *              而且还能防止反序列化重新创建新的对象。
 *          2) 这种方式是Effective Java作者Josh Bloch 提倡的方式
 *          3) 结论：推荐使用
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        System.out.println(instance1 == instance2);//true
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        instance1.sayOK();
    }

}

//使用枚举，可以实现单例, 推荐
enum Singleton {
    INSTANCE; //属性

    public void sayOK() {
        System.out.println("ok~");
    }
}
