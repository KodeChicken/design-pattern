package com.zhuyz.singleton.type6;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 19:40
 * @description
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        // 单线程：ok
//        Singleton instance = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//
//        System.out.println("是否相等 " + (instance == instance2));
//        System.out.println("instance " + instance.hashCode());
//        System.out.println("instance2 " + instance2.hashCode());

        // 多线程：ok
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton instance3 = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + ": hashCode-> " + instance3.hashCode());
            }, i + "").start();
        }

    }
}

/**
 * 懒汉式-线程安全，同步代码块
 */
class Singleton {

    /**
     * 2.本类内部创建对象实例，添加volatile，可以理解成轻量级的synchronized，
     * 保证可见性、有序性，防止指令重排序，但并不能保证原子性
     * 参考博客：https://www.cnblogs.com/quzhongren/p/11383998.html
     */
    private static volatile Singleton singleton;

    /**
     * 1.构造器私有化，外部不能new
     */
    private Singleton() {
    }

    /**
     * 3.对外提供一个公有的静态方法，加入双重锁检查，解决线程安全问题
     * @return
     */
    public static Singleton getInstance() {
        // 懒汉式
        if (singleton == null) {    // 多线程下所有的线程都执行完当前行等待时，存在线程不安全问题
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
