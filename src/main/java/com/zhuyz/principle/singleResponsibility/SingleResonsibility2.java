package com.zhuyz.principle.singleResponsibility;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 15:38
 * @description
 */
public class SingleResonsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        AirVehicle airVehicle = new AirVehicle();
        WaterVehicle waterVehicle = new WaterVehicle();
    }
}



class RoadVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}

class AirVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在天上运行");
    }
}
class WaterVehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}