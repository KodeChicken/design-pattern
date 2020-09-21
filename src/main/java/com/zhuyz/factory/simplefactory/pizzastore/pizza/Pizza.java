package com.zhuyz.factory.simplefactory.pizzastore.pizza;

/**
 * @author zhuyz
 * @date 2020/6/27 0027 23:15
 * @description
 */
public abstract class Pizza {

    // 名字
    private String name;
    // 准备原材料，不同的披萨是不一样的原材料，因此需要做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking");
    }

    public void cut() {
        System.out.println(name + " cuting");
    }

    // 打包
    public void box() {
        System.out.println(name + " boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
