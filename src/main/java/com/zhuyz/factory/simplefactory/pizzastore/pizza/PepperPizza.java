package com.zhuyz.factory.simplefactory.pizzastore.pizza;

/**
 * @author zhuyz
 * @date 2020/6/27 0027 23:48
 * @description
 */
public class PepperPizza extends Pizza{


    @Override
    public void prepare() {
        System.out.println("给制作胡椒披萨准备原材料");
    }
}
