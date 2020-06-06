package com.zhuyz.singleton.type3;

import java.util.concurrent.TimeUnit;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 19:40
 * @description
 */
public class SingletonTest03 {

    public static void main(String[] args) {
//        单线程下：ok
//        Singleton instance = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//
//        System.out.println("是否相等 " + (instance == instance2));
//        System.out.println("instance " + instance.hashCode());
//        System.out.println("instance2 " + instance2.hashCode());

//        多线程下对象实例化多次：error
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton instance3 = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ": hashCode-> " + instance3.hashCode());
            }, i + "").start();
        }


    }
}

/**
 * 懒汉式-线程不安全
 */
class Singleton {

    /**
     * 2.本类内部创建对象实例
     */
    private static Singleton singleton;

    /**
     * 1.构造器私有化，外部不能new
     */
    private Singleton() {
    }

    /**
     * 3.对外提供一个公有的静态方法，当使用到该方法时，才去创建实例
     *
     * @return
     */
    public static Singleton getInstance() {
        // 懒汉式
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
