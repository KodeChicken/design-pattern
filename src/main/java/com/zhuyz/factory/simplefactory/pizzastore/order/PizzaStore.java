package com.zhuyz.factory.simplefactory.pizzastore.order;

/**
 * pizza点，相当于一个客户端，发起订购
 * @author zhuyz
 * @date 2020/6/27 0027 23:34
 * @description
 */
public class PizzaStore {

    public static void main(String[] args) {

//        new OrderPizza();

        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序 ");


    }


}
