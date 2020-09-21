package com.zhuyz.factory.simplefactory.pizzastore.order;

import com.zhuyz.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * 简单工厂类
 * @author zhuyz
 * @date 2020/6/28 0028 10:30
 * @description
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if(orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }


}
