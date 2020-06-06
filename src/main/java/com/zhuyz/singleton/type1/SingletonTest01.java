package com.zhuyz.singleton.type1;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 19:40
 * @description
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("是否相等 " + (instance == instance2));
        System.out.println("instance " + instance.hashCode());
        System.out.println("instance2 " + instance2.hashCode());
    }
}

/**
 * 饿汉式-静态变量
 */
class Singleton {

    /**
     * 2.本类内部创建对象实例
     */
    private final static Singleton SINGLETON = new Singleton();

    /**
     * 1.构造器私有化，外部不能new
     */
    private Singleton() {
    }

    /**
     * 3.对外提供一个公有的静态方法，返回实例对象
     * @return
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }

}
