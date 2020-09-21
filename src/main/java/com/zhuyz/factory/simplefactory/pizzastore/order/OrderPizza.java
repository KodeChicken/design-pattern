package com.zhuyz.factory.simplefactory.pizzastore.order;

import com.zhuyz.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.zhuyz.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhuyz
 * @date 2020/6/27 0027 23:24
 * @description
 */
public class OrderPizza extends Pizza {
    @Override
    public void prepare() {

    }

//    public OrderPizza() {
//        Pizza pizza = null;
//        String orderType;   //订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if (orderType.equals("cheese")) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else if(orderType.equals("pepper")) {
//                pizza = new PepperPizza();
//                pizza.setName("胡椒披萨");
//            } else {
//                break;
//            }
//            // 输出pizza 制作的过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";  //用户输入的
        this.simpleFactory = simpleFactory; //设置简单工厂对象
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza 制作的过程
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        } while (true);
    }





    // 获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type: ");
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
