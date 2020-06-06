package com.zhuyz.principle.ocp.improve;

import sun.security.provider.SHA;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 18:12
 * @description
 */
public class Ocp {

    public static void main(String[] args) {

        GraphicEdit graphicEdit = new GraphicEdit();
        graphicEdit.drawGraphic(new Rectangle());
        graphicEdit.drawGraphic(new Circle());
        graphicEdit.drawGraphic(new Triangle());



    }



}


class GraphicEdit {

    public void drawGraphic(Shape shape) {
        shape.draw();
    }

}

abstract class Shape {
    int type;
    public abstract void draw(); // 抽象方法
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape {
    public Triangle() {
        super.type = 3;
    }
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}



