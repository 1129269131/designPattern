package com.atguigu.designPattern03.day17mediator.demo;

/**
 * Create by koala on 2021-06-08
 */
public class Client {

    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
        Alarm alarm = new Alarm(mediator, "alarm");

        //创建了CoffeeMachine 对象，并且加入到 ConcreteMediator 对象的HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
                "coffeeMachine");

        //创建 Curtains , 并且加入到 ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }

}
