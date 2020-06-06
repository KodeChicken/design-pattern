package com.zhuyz.singleton.type8;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 19:40
 * @description
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        // 单线程：ok
//        Singleton instance = Singleton.INSTANCE;
//        Singleton instance2 = Singleton.INSTANCE;
//        System.out.println("是否相等 " + (instance == instance2));
//        System.out.println("instance " + instance.hashCode());
//        System.out.println("instance2 " + instance2.hashCode());

        // 多线程：ok
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Singleton instance3 = Singleton.INSTANCE;
                System.out.println(Thread.currentThread().getName() + ": hashCode-> " + instance3.hashCode());
            }, i + "").start();
        }
    }
}

enum Singleton {

    INSTANCE;

}
