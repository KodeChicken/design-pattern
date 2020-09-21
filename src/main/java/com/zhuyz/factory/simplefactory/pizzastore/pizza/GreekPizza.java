package com.zhuyz.factory.simplefactory.pizzastore.pizza;

/**
 * @author zhuyz
 * @date 2020/6/27 0027 23:17
 * @description
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨准备原材料");
    }
}
