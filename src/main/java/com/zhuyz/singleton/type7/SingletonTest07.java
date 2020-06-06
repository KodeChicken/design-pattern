package com.zhuyz.singleton.type7;

/**
 * @author zhuyz
 * @date 2020/6/6 0006 19:40
 * @description
 */
public class SingletonTest07 {

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
 * 静态内部类
 */
class Singleton {

    /**
     * 1.构造器私有化，外部不能new
     */
    private Singleton() {
    }

    /**
     * 2.对外提供一个公有的静态方法，加入双重锁检查，解决线程安全问题
     * @return
     */
    public static Singleton getInstance() {
        return SingletonInstance.SINGLETON;
    }

    /**
     * 3.静态内部类不会随着外部类的加载而加载 ,只有静态内部类的静态成员被调用时才会进行加载,
     * 这样既保证的惰性初始化（Lazy-Initialazation），又由JVM保证了多线程并发访问的正确性。
     * 参考博客：https://blog.csdn.net/ren421259121/article/details/89947692
     */
    private static class SingletonInstance {
        private static final Singleton SINGLETON = new Singleton();
    }

}
