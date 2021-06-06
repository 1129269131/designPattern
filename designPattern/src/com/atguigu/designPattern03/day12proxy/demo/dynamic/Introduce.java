package com.atguigu.designPattern03.day12proxy.demo.dynamic;

/**
 * 动态代理：
 *      动态代理模式的基本介绍：
 *          1）代理对象不需要实现接口，但是目标对象仍然要实现接口，否则不能用动态代理
 *          2）代理对象的生成是利用 JDK 的 API（会用到JDK的反射机制），
 *              动态地在内存中构建代理对象（返回代理对象后，再通过代理对象去调用目标对象的方法）
 *          3）动态代理也叫做：JDK 代理、接口代理
 *
 *      JDK中生成代理对象的API
 *          1）代理类所在包:java.lang.reflect.Proxy
 *          2）JDK 实现代理只需要使用 newProxyInstance 方法,但是该方法需要接收三个参数,完整的写法是：
 *              static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
 * Create by koala on 2021-06-06
 */
public class Introduce {
}
