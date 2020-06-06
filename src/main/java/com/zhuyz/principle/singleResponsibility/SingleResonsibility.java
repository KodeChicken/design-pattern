package com.zhuyz.principle.singleResponsibility;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 15:32
 * @description
 */
public class SingleResonsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }


}

// 交通工具类
// 方式1.
// 1. 在方式1的run方法中，违反了单一职责原则
// 2. 解决方案：: 根据交通工具运行的方法不同，分解成不同的类
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行");


    }


}


