package com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.order;

import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.CheesePizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.GreekPizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.PepperPizza;
import com.atguigu.designPattern03.day02factory.simplefactory01.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Create by koala on 2021-03-23
 * 传统的方式：
 * 		传统的方式的优缺点：
 *      		1) 优点是比较好理解，简单易操作。
 *      		2) 缺点是违反了设计模式的ocp原则，即对扩展开放，对修改关闭。
 *          		即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码
 *      		3) 改进的思路分分析：
 *          		修改代码可以接受，但是如果我们在其它的地方也有创建Pizza的代码，就意味着，也需要修改，
 *          		而创建Pizza的代码，往往有多处。
 *          		思路：把创建Pizza对象封装到一个类中，这样我们有新的Pizza种类时，只需要修改该类就可，
 *          		其它有创建到Pizza对象的代码就不需要修改了 --> 简单工厂模式
 */
public class OrderPizza0 {

	public OrderPizza0() {
		Pizza pizza = null;
		String orderType; // 订购披萨的类型
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			} else {
				break;
			}
			//输出pizza 制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

		} while (true);
	}

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
