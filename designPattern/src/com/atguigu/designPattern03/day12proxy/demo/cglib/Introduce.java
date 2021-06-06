package com.atguigu.designPattern03.day12proxy.demo.cglib;

/**
 * Cglib代理：
 *      Cglib代理模式的基本介绍：
 *          1）静态代理和JDK 代理模式都要求目标对象是实现一个接口,但是有时候目标对象只是一个单独的对象,
 *              并没有实现任何的接口,这个时候可使用目标对象子类来实现代理-这就是 Cglib 代理
 *          2）Cglib 代理也叫作子类代理,它是在内存中构建一个子类对象从而实现对目标对象功能扩展,
 *              有些书也将Cglib代理归属到动态代理。
 *          3）Cglib 是一个强大的高性能的代码生成包,它可以在运行期扩展 java 类与实现 java 接口.
 *              它广泛的被许多 AOP 的框架使用,例如 Spring AOP实现方法拦截就用到了Cglib包
 *          4）在 AOP 编程中如何选择代理模式：
 *                  目标对象需要实现接口，用 JDK 代理
 *                  目标对象不需要实现接口，用 Cglib 代理
 *          5）Cglib 包的底层是通过使用字节码处理框架 ASM 来转换字节码并生成新的类
 *
 *      Cglib代理模式实现步骤
 *          1）需要引入 cglib 的 jar 文件（spring的核心包中已经包括了cglib功能，所以直接引入spring-core.jar即可）
 *          2）在内存中动态构建子类，注意代理的类不能为 final，否则报错：java.lang.IllegalArgumentException
 *          3）目标对象的方法如果为 final/static,那么就不会被拦截,即不会执行目标对象额外的业务方法
 * Create by koala on 2021-06-06
 */
public class Introduce {
}
